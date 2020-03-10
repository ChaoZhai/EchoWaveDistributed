package uk.ac.ncl.zc.entity;

/**
 * @ClassName ElectionNode
 * @Description: TODO
 * @Author BENY
 * @Date 2019/10/17
 * @Version V1.0
 **/
public class ElectionNode extends WaveNode {

    /**
     * @Fields recivedWakeupCalls : WRp
     */
    private int recivedWakeupCalls;

    /**
     * @Fields winNode : Vp
     */
    private WaveNode winNode;

    public ElectionNode(int id) {
        super(id);
    }

    /**
     * @Title Constructor for ElectionNode
     * @Description
     * @param id
     */






    private boolean readMessage() {
        if (this.messageQueue.size() > 0) {
            Message msg = this.messageQueue.poll();
            if (msg.getMessagetype() == MessageType.ELECTION_WAKEUP_MESSAGE)
                this.recivedWakeupCalls += 1;
            else if (msg.getMessagetype() == MessageType.ELECTION_TOKEN_MESSAGE) {
                if (this.recp.get(msg.getSender()) != null) {
                    if (this.getFalseNodeAmountInRecp() == 1)
                        this.silentNeighbour = msg.getSender();
                    this.recp.put(msg.getSender(), true);
                } else {
                    throw new IllegalStateException("Message Sender not found in Recp");
                }
                this.winNode = this.winNode.getId() < msg.getElectionNode().getId() ? this.winNode
                        : msg.getElectionNode();
            }
            return true;
        }
        return false;
    }

    private boolean readMessage(MessageType msgType) {
        if (this.messageQueue.size() > 0) {
            Message msg = this.messageQueue.poll();
            switch (msgType) {
                case ELECTION_WAKEUP_MESSAGE: {
                    if (msg.getMessagetype() == MessageType.ELECTION_WAKEUP_MESSAGE) {
                        this.recivedWakeupCalls += 1;
                        return true;
                    } else {
                        this.messageQueue.add(msg);
                        return false;
                    }
                }
                case ELECTION_TOKEN_MESSAGE: {
                    if (msg.getMessagetype() == MessageType.ELECTION_TOKEN_MESSAGE) {
                        if (this.recp.get(msg.getSender()) != null) {
                            if (this.getFalseNodeAmountInRecp() == 1)
                                this.silentNeighbour = msg.getSender();
                            this.recp.put(msg.getSender(), true);
                        } else {
                            throw new IllegalStateException("Message Sender not found in Recp");
                        }
                        this.winNode = this.winNode.getId() < msg.getElectionNode().getId() ? this.winNode
                                : msg.getElectionNode();
                        return true;
                    } else {
                        this.messageQueue.add(msg);
                        return false;
                    }
                }
            }
        }
        return false;
    }

    private void display(StatusType lastStatus, StatusType newStatus, WaveNode relatedNode) {
        if (lastStatus == newStatus)
            System.out.println(this.toString() + ": Do nothing");
        else if (lastStatus == StatusType.WAVE_START && newStatus == StatusType.WAVE_SENT_TO_SILENT_NEIGHBOUR)
            System.out.println(this.toString() + ": Send a token to its silent neighbour: " + relatedNode.toString());
        else if (lastStatus == StatusType.WAVE_SENT_TO_SILENT_NEIGHBOUR && newStatus == StatusType.WAVE_DECIDE) {
            System.out.println(
                    this.toString() + ": has recived a token from its silent neighbour: " + relatedNode.toString());
            System.out.println(this.toString() + ": Decides!");
        }
    }

    private boolean hasWakeupMessage() {
        return this.messageQueue.stream().filter(msg -> msg.getMessagetype() == MessageType.ELECTION_WAKEUP_MESSAGE)
                .count() > 0;
    }

    private boolean hasTokenMessage() {
        return this.messageQueue.stream().filter(msg -> msg.getMessagetype() == MessageType.ELECTION_TOKEN_MESSAGE)
                .count() > 0;
    }
}

package uk.ac.ncl.zc.entity;
/**
 * @ClassName StatusType
 * @Description: TODO
 * @Author BENY
 * @Date 2019/10/17
 * @Version V1.0
 */
public enum StatusType {
    WAVE_START, WAVE_SENT_TO_SILENT_NEIGHBOUR, WAVE_DECIDE,

    // initiator node(send token to all neighbours)
    ECHO_START,
    //send token to all neighbours except father
    ECHO_SEND_TO_CHILDREN,
    //receive all neighbours token except father
    ECHO_SEND_TO_FATHER,
    //receive all neighbours include father
    ECHO_DECIDE
}

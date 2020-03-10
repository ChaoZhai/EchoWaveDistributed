package uk.ac.ncl.zc.distributed;

import uk.ac.ncl.zc.entity.ElectionNode;
import uk.ac.ncl.zc.entity.Tree;
import uk.ac.ncl.zc.entity.WaveNode;

/**
 * @ClassName SetupTree
 * @Description: TODO
 * @Author BENY
 * @Date 2019/10/18
 * @Version V1.0
 **/
public class SetupTree {


    static public Tree setUpBalancedBinaryTreeForWave() {
        WaveNode server0 = new WaveNode(0);
        WaveNode server1 = new WaveNode(1);
        WaveNode server2 = new WaveNode(2);
        WaveNode server3 = new WaveNode(3);
        WaveNode server4 = new WaveNode(4);
        WaveNode server5 = new WaveNode(5);
        WaveNode server6 = new WaveNode(6);
        WaveNode server7 = new WaveNode(7);
        WaveNode server8 = new WaveNode(8);

        Tree waveTree = new Tree(server0);
        waveTree.addRelation(server0, server1);
        waveTree.addRelation(server0, server2);
        waveTree.addRelation(server1, server3);
        waveTree.addRelation(server1, server4);
        waveTree.addRelation(server2, server5);
        waveTree.addRelation(server2, server6);
        waveTree.addRelation(server4, server7);
        waveTree.addRelation(server5, server8);
        waveTree.initializeTree();

        System.out.println("====BalancedBinaryTree generated as follow:");
        waveTree.printTree();
        return waveTree;
    }

    static public Tree setUpUnbalancedBinaryTreeForWave() {
        WaveNode server0 = new WaveNode(0);
        WaveNode server1 = new WaveNode(1);
        WaveNode server2 = new WaveNode(2);
        WaveNode server3 = new WaveNode(3);
        WaveNode server4 = new WaveNode(4);
        WaveNode server5 = new WaveNode(5);
        WaveNode server6 = new WaveNode(6);
        WaveNode server7 = new WaveNode(7);
        WaveNode server8 = new WaveNode(8);

        Tree waveTree = new Tree(server0);
        waveTree.addRelation(server0, server1);
        waveTree.addRelation(server0, server2);
        waveTree.addRelation(server1, server3);
        waveTree.addRelation(server1, server4);
        waveTree.addRelation(server4, server5);
        waveTree.addRelation(server4, server6);
        waveTree.addRelation(server6, server7);
        waveTree.addRelation(server7, server8);
        waveTree.initializeTree();

        System.out.println("====UnbalancedBinaryTree generated as follow:");
        waveTree.printTree();

        return waveTree;
    }

    static public Tree setUpArbitraryTreeForWave() {
        WaveNode server0 = new WaveNode(0);
        WaveNode server1 = new WaveNode(1);
        WaveNode server2 = new WaveNode(2);
        WaveNode server3 = new WaveNode(3);
        WaveNode server4 = new WaveNode(4);
        WaveNode server5 = new WaveNode(5);
        WaveNode server6 = new WaveNode(6);
        WaveNode server7 = new WaveNode(7);
        WaveNode server8 = new WaveNode(8);

        Tree waveTree = new Tree(server0);
        waveTree.addRelation(server0, server1);
        waveTree.addRelation(server0, server2);
        waveTree.addRelation(server0, server3);
        waveTree.addRelation(server0, server4);
        waveTree.addRelation(server0, server5);
        waveTree.addRelation(server0, server6);
        waveTree.addRelation(server0, server7);
        waveTree.addRelation(server0, server8);
        waveTree.initializeTree();

        System.out.println("====ArbitraryTree generated as follow:");
        waveTree.printTree();

        return waveTree;
    }
    static public Tree setUpBalancedBinaryTreeForElection() {
        WaveNode server0 = new ElectionNode(0);
        WaveNode server1 = new ElectionNode(1);
        WaveNode server2 = new ElectionNode(2);
        WaveNode server3 = new ElectionNode(3);
        WaveNode server4 = new ElectionNode(4);
        WaveNode server5 = new ElectionNode(5);
        WaveNode server6 = new ElectionNode(6);
        WaveNode server7 = new ElectionNode(7);
        WaveNode server8 = new ElectionNode(8);

        Tree waveTree = new Tree(server0);
        waveTree.addRelation(server0, server1);
        waveTree.addRelation(server0, server2);
        waveTree.addRelation(server1, server3);
        waveTree.addRelation(server1, server4);
        waveTree.addRelation(server2, server5);
        waveTree.addRelation(server2, server6);
        waveTree.addRelation(server4, server7);
        waveTree.addRelation(server5, server8);
        waveTree.initializeTree();

        System.out.println("====BalancedBinaryTree generated as follow:");
        waveTree.printTree();
        return waveTree;
    }

    static public Tree setUpUnbalancedBinaryTreeForElection() {
        WaveNode server0 = new ElectionNode(0);
        WaveNode server1 = new ElectionNode(1);
        WaveNode server2 = new ElectionNode(2);
        WaveNode server3 = new ElectionNode(3);
        WaveNode server4 = new ElectionNode(4);
        WaveNode server5 = new ElectionNode(5);
        WaveNode server6 = new ElectionNode(6);
        WaveNode server7 = new ElectionNode(7);
        WaveNode server8 = new ElectionNode(8);

        Tree waveTree = new Tree(server0);
        waveTree.addRelation(server0, server1);
        waveTree.addRelation(server0, server2);
        waveTree.addRelation(server1, server3);
        waveTree.addRelation(server1, server4);
        waveTree.addRelation(server4, server5);
        waveTree.addRelation(server4, server6);
        waveTree.addRelation(server6, server7);
        waveTree.addRelation(server7, server8);
        waveTree.initializeTree();

        System.out.println("====UnbalancedBinaryTree generated as follow:");
        waveTree.printTree();

        return waveTree;
    }

    static public Tree setUpArbitraryTreeForElection() {
        WaveNode server0 = new ElectionNode(0);
        WaveNode server1 = new ElectionNode(1);
        WaveNode server2 = new ElectionNode(2);
        WaveNode server3 = new ElectionNode(3);
        WaveNode server4 = new ElectionNode(4);
        WaveNode server5 = new ElectionNode(5);
        WaveNode server6 = new ElectionNode(6);
        WaveNode server7 = new ElectionNode(7);
        WaveNode server8 = new ElectionNode(8);

        Tree waveTree = new Tree(server0);
        waveTree.addRelation(server0, server1);
        waveTree.addRelation(server0, server2);
        waveTree.addRelation(server0, server3);
        waveTree.addRelation(server0, server4);
        waveTree.addRelation(server0, server5);
        waveTree.addRelation(server0, server6);
        waveTree.addRelation(server0, server7);
        waveTree.addRelation(server0, server8);
        waveTree.initializeTree();

        System.out.println("====ArbitraryTree generated as follow:");
        waveTree.printTree();

        return waveTree;
    }
}

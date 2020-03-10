package uk.ac.ncl.zc.distributed;

import uk.ac.ncl.zc.entity.Tree;

/**
 * @ClassName UseWaveAlgorithm
 * @Description: TODO
 * @Author BENY
 * @Date 2019/10/18
 * @Version V1.0
 **/
public class UseWaveAlgorithm {

    public static void main(String[] args) {
        System.out.println("========Start Echo Algorithm");
        Tree balanceTree = SetupTree.setUpBalancedBinaryTreeForWave();
        balanceTree.iterateActivateRandomNodes(10);


    }
}

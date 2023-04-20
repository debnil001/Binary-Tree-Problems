/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

/**
 *
 * @author HP
 */
public class CountNodesEqualtoAverageOfSubtree {
    class Solution {
    int total=0;
    public int[] countSubtree(TreeNode root){
        if(root==null)
            return new int[]{0,0};
        int[] leftSubtree=countSubtree(root.left);
        int[] rightSubtree=countSubtree(root.right);

        int sum=leftSubtree[0]+rightSubtree[0]+root.val;
        int countOfNode=leftSubtree[1]+rightSubtree[1]+1;
        System.out.println(sum/countOfNode);
        if((sum/countOfNode)==root.val)
            total++;
        return new int[]{sum,countOfNode};
    }
    public int averageOfSubtree(TreeNode root) {
        countSubtree(root);
        return total;
    }
}
}

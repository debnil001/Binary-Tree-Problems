/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

/**
 *
 * @author HP
 */
public class PathSumI {
    class Solution {
    public boolean help(TreeNode root,int targetSum,int currSum){
        if(root.left==null && root.right==null){
            currSum+=root.val;
            System.out.println(currSum);
            return targetSum==currSum;
        }
        boolean left=false,right=false;
        if(root.left!=null)
            left=help(root.left,targetSum,currSum+root.val);
        if(root.right!=null)
            right=help(root.right,targetSum,currSum+root.val);
        if(left||right)
            return true;
        else
            return false;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        return help(root,targetSum,0);
    }
}
}

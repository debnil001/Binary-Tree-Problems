/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

/**
 *
 * @author HP
 */
public class BinaryTreePrunning {
    class Solution {
    int min=Integer.MAX_VALUE;
    TreeNode prev=null;
    public void findMin(TreeNode root){
        if(root==null)
            return;
        findMin(root.left);
        if(prev!=null){
            min=Math.min(min,root.val-prev.val);
        }
        prev=root;
        findMin(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        findMin(root);
        return min;
    }
}
}

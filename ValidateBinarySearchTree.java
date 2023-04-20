/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

/**
 *
 * @author HP
 */
 class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

    TreeNode(int rootVal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    }
public class ValidateBinarySearchTree {
    class Solution {
    public boolean isValid(TreeNode root,TreeNode min,TreeNode max){
        if(root==null)
            return true;
        if(min!=null && root.val<=min.val)
            return false;
        else if(max!=null && root.val>=max.val)
            return false;
        
        return isValid(root.left,min,root)&&isValid(root.right,root,max);
    }
    public boolean isValidBST(TreeNode root) {
        TreeNode min=null,max=null;
        return isValid(root,min,max);
    }
}
}

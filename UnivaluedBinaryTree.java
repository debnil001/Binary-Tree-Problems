/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

/**
 *
 * @author HP
 */
public class UnivaluedBinaryTree {
 class Solution {
    public boolean help(TreeNode root,int val){
        if(root==null)
            return true;
        if(root.val!=val)
            return false;
        return help(root.left,val)&&help(root.right,val);
    }
    public boolean isUnivalTree(TreeNode root) {
        return help(root,root.val);
    }
}   
}

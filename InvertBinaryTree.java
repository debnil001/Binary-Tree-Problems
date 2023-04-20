/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

/**
 *
 * @author HP
 */
public class InvertBinaryTree {
 class Solution {
    public void invert(TreeNode root){
        if(root==null)
            return;
        invert(root.left);
        invert(root.right);
          TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
    }
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
}   
}

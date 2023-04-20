/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

/**
 *
 * @author HP
 */
public class EvaluateBooleanBinaryTree {
 class Solution {
    public boolean evaluateTree(TreeNode root) {
       if(root.left==null && root.right==null){
            if(root.val==1)
                return true;
            else 
                return false;
        }
        boolean val1=evaluateTree(root.left);
        boolean val2=evaluateTree(root.right);
        if(root.val==2)
            return val1||val2;
        else
            return val1&&val2;
    }
}
}

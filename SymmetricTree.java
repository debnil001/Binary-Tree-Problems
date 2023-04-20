/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

/**
 *
 * @author HP
 */
public class SymmetricTree {
    class Solution {
    public boolean help(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null)
            return true;
        if(root1==null || root2==null||root1.val!=root2.val)
            return false;
        return help(root1.left,root2.right) && help(root1.right,root2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        // if(root.left==null&&root.right==null)
        //     return true;
        return help(root.left,root.right);
    }
}
}

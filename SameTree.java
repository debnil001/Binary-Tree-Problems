/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

/**
 *
 * @author HP
 */
public class SameTree {
    class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null)
            return p==q;
        return (p.val==q.val)
                && isSameTree(p.left,q.left)
                && isSameTree(p.right,q.right); 
    }
}
}

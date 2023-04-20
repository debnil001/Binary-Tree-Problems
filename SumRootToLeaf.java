/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

/**
 *
 * @author HP
 */
public class SumRootToLeaf {
    public class Solution {
    int total;
    
    public int sumNumbers(TreeNode root) {
        total = 0;
        helper(root, 0);
        return total;
    }
    
    void helper(TreeNode root, int sum) {
        if (root == null) return;
        
        sum = sum * 10 + root.val;
        
        if (root.left == null && root.right == null) {
            total += sum;
            return;
        }
        
        helper(root.left, sum);
        helper(root.right, sum);
    }
}
}

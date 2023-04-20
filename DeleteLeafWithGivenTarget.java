/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

/**
 *
 * @author HP
 */
public class DeleteLeafWithGivenTarget {
    class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root==null)
            return null;
        root.left=removeLeafNodes(root.left,target);
        root.right=removeLeafNodes(root.right,target);
        if(root.val==target && root.left==null && root.right==null)
            return null;
        return root;
    }
}
}

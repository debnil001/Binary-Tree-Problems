/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

/**
 *
 * @author HP
 */
public class ConstructBinaryTreeFromPostorderansInorder {
    class Solution {
    int postEnd;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length != postorder.length || inorder.length == 0)
            return null;
        postEnd = postorder.length - 1;
        return helper(inorder, postorder, 0, postEnd);
    }

    TreeNode helper(int[] inorder, int[] postorder, int start, int end){
        if(start > end)
            return null;
        TreeNode curr = new TreeNode(postorder[postEnd--]);
        if(start == end)
            return curr;

        int index = 0;
        for(int i=end; i>=0; i--){
            if(inorder[i] == curr.val){
                index = i;
                break;
            }
        }
        curr.right = helper(inorder, postorder, index+1, end);
        curr.left = helper(inorder, postorder, start, index-1);

        return curr;
    }
}
}

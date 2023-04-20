/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

/**
 *
 * @author HP
 */
public class SubtreeOfAnotherBinaryTree {
    class Solution {
    public boolean isIdentical(TreeNode root,TreeNode subRoot){
        if(root==null && subRoot==null)
            return true;
        else if(root==null || subRoot==null || root.val!=subRoot.val)
            return false;
        else if(!isIdentical(root.left,subRoot.left))
            return false;
        else if(!isIdentical(root.right,subRoot.right))
            return false;
        
        return true;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)
            return false;
        if(root.val==subRoot.val){
            if(isIdentical(root,subRoot))
                return true;
        }

        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author HP
 */
public class CheckCompletenessOfBinaryTree {
    class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node=q.remove();
            if(node!=null){
                q.add(node.left);
                q.add(node.right);
            }
            else{
                while(!q.isEmpty()){
                    TreeNode dum=q.remove();
                    if(dum!=null)
                        return false;
                }
            }
        }
        return true;
    }
}
}

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
public class MaximumWidthOfTree {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
class Solution {
    class Pair{
        TreeNode node;
        int index;
        public Pair(TreeNode node,int index){
            this.node=node;
            this.index=index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        int maxWidth=0;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            int minIndex=q.peek().index,lastIndex=0;
            for(int i=0;i<size;i++){
                Pair p=q.remove();
                if(i==size-1)
                    lastIndex=p.index;
                if(p.node.left!=null){
                    q.add(new Pair(p.node.left,(2*(p.index-minIndex)+1)));
                }
                if(p.node.right!=null){
                    q.add(new Pair(p.node.right,(2*(p.index-minIndex)+2)));
                }
            }
            maxWidth=Math.max(maxWidth,lastIndex-minIndex+1);
        }
        return maxWidth;       
    }
}
}

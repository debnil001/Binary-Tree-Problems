/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class BalanceBinarySearchTree {
 class Solution {
    public void inorder(TreeNode root,ArrayList<Integer> res){
        if(root==null)
            return;
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
    public TreeNode createBalancedBST(ArrayList<Integer> seq,int start,int end){
        if(start>end)
            return null;
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(seq.get(mid));
        root.left=createBalancedBST(seq,start,mid-1);
        root.right=createBalancedBST(seq,mid+1,end);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> inorderSeq=new ArrayList<>();
        inorder(root,inorderSeq);
        TreeNode newRoot=createBalancedBST(inorderSeq,0,inorderSeq.size()-1);
        return newRoot;
    }
}   
}

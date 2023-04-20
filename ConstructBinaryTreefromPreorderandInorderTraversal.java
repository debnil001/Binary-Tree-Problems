/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

import java.util.HashMap;

/**
 *
 * @author HP
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal {
class Solution {
    public TreeNode formTree(int[]preorder,int pstart,int pend,int[]inorder,int istart,int iend,HashMap<Integer,Integer> hm){
        if(pstart>pend || istart>iend)
            return null;
        int rootVal=preorder[pstart];
        TreeNode root=new TreeNode(rootVal);
        int rootIndex=hm.get(rootVal);
        int left=rootIndex-istart;

        root.left=formTree(preorder,pstart+1,pstart+left,inorder,istart,rootIndex-1,hm);

        root.right=formTree(preorder,pstart+left+1,pend,inorder,rootIndex+1,iend,hm);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }

        TreeNode ans=formTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,hm);
        return ans;
    }
}
}

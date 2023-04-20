/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author HP
 */
public class ZigZagLevelOrderTraversing {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>(); 
        if(root==null)
            return res;
        // help(res,root,1);
        // return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean flag=true;
        while(!q.isEmpty()){
            int size=q.size();
            System.out.println(q.size());
            ArrayList<Integer> ans=new ArrayList<>();
            while(size-->0){
                TreeNode node=q.remove();
                if(flag==true){
                    // if(node!=null)
                    ans.add(node.val);
                }
                else{
                    // if(node!=null)
                    ans.add(0,node.val);
                }
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
            flag=!flag;
            // if(ans.size()>0)
            res.add(new ArrayList(ans));
        }
        return res;
    }
}

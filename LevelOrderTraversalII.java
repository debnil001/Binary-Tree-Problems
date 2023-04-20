/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class LevelOrderTraversalII {
    class Solution {
    public void help(List<List<Integer>> res,TreeNode root,int level){
        if(root==null)
        return;
        if(level>res.size()){
            res.add(0,new ArrayList<>());
        }
        help(res,root.left,level+1);
        help(res,root.right,level+1);
        res.get(res.size()-level).add(root.val);
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        help(res,root,1);
        return res;
    }
}
}

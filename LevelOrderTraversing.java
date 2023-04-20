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
public class LevelOrderTraversing {
    class Solution {
    void help(List<List<Integer>> res,TreeNode root,int level){
        if(root==null)
            return;
        if(level>res.size()){
            res.add(new ArrayList<>());
        }
        help(res,root.left,level+1);
        help(res,root.right,level+1);
        res.get(level-1).add(root.val);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        help(res,root,1);
        return res;
    }
}
}

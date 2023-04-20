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
public class PathSumII {
    class Solution {
    public int getSum(ArrayList<Integer> al){
        int sum=0;
        for(int i:al){
            sum+=i;
        }
        return sum;
    }
    public void helper(TreeNode root,List<List<Integer>> res,ArrayList<Integer> temp,int sum){
        if(root==null)
            return;
        if(root.left==null && root.right==null){
            temp.add(root.val);
            if(getSum(temp)==sum)
                res.add(new ArrayList<>(temp));
            temp.remove(temp.size()-1);
            return;
        }
        temp.add(root.val);
        helper(root.left,res,temp,sum);
        helper(root.right,res,temp,sum);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        helper(root,res,temp,targetSum);
        return res;
    }
}
}

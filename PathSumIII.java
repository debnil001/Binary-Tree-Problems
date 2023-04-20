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
public class PathSumIII {
    class Solution {
    static int count;
    public void helper(TreeNode root,ArrayList<Integer> temp,int sum){
        if(root==null)
            return;
        temp.add(root.val);
        helper(root.left,temp,sum);
        helper(root.right,temp,sum);
        long s=0;
        for(int i=temp.size()-1;i>=0;i--){
            s+=temp.get(i);
            if(s==sum)
                count++;
        }
        temp.remove(temp.size()-1);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)
            return 0;
        count=0;
        if(root!=null && root.left==null && root.right==null)
            return root.val==targetSum?1:0;
        helper(root,new ArrayList<>(),targetSum);
        return count;
    }
}
}

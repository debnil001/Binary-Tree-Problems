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
public class BinaryTreePaths {
 class Solution {
    public void getPaths(TreeNode root,String ans,List<String> res){
        if(root==null)
            return;
        if(root.left==null && root.right==null){
            res.add(ans+root.val);
            return;
        }
        // if(root.left!=null)
            getPaths(root.left,ans+root.val+"->",res);
        // if(root.right!=null)
            getPaths(root.right,ans+root.val+"->",res);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();;
        getPaths(root,"",res);
        return res;
    }
}   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

/**
 *
 * @author HP
 */
public class LeftLeafSumofBinaryTree {
    /**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
//class Solution {
//public:
//    int returnSumOfLeftLeaves(TreeNode* root,bool isLeft){
//        if(root==nullptr)
//            return 0;
//
//        if(root->left==nullptr&&root->right==nullptr&&isLeaf){
//            return root->val;
//        }
//        return returnSumOfLeftLeaves(root->left,true)+returnSumOfLeftLeaves(root->right,false);
//    }
//    int sumOfLeftLeaves(TreeNode* root) {
//        return returnSumOfLeftLeaves(root,false);
//    }
//};
}

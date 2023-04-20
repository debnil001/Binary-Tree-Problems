/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

/**
 *
 * @author HP
 */
public class LeafSimilarTree {
    class Solution {
public:
    void getLeaves(TreeNode* root,vector<int> &leaves){
        if(root==NULL)
            return;
        if(root->left==NULL&&root->right==NULL){
            leaves.push_back(root->val);
        }
        getLeaves(root->left,leaves);
        getLeaves(root->right,leaves);
    }
    bool leafSimilar(TreeNode* root1, TreeNode* root2) {
        vector<int> leaves1,leaves2;
        getLeaves(root1,leaves1);
        getLeaves(root2,leaves2);

        return leaves1==leaves2;
    }
};
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

/**
 *
 * @author HP
 */
public class ConvertSortedListToBinarySearchTree {
    class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
            return null;
        return createBST(head,null);
    }
    public TreeNode createBST(ListNode head,ListNode last){
        ListNode slow=head,fast=head;
        if(head==last)
            return null;
        while(fast!=last && fast.next!=last){
            slow=slow.next;
            fast=fast.next.next;
        }
        TreeNode newNode=new TreeNode(slow.val);
        newNode.left=createBST(head,slow);
        newNode.right=createBST(slow.next,last);
        return newNode;
    }
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

/**
 *
 * @author HP
 */

public class AVLTrree {
    static class Node{
        int data,height;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.height=1;
        }
    }
    public static int height(Node root){
            if(root==null)
                    return 0;
            return root.height;
    }
    public int getBalanceFactor(Node root){
        if(root==null)
              return 0;
        return height(root.left)-height(root.right);
    }
    public Node insert(Node root,int key){
        if(root==null)
              return new Node(key);
        if(key>root.data)
            root.right=insert(root.right,key);
        else if(key<root.data)
            root.left=insert(root.left,key);
        else
            return root;
        
        root.height=1+Math.max(height(root.left), height(root.right));
        int balanceFactor=getBalanceFactor(root);
        
        //left left case
        if(balanceFactor>1 && key<root.left.data){
//            root=rotateRight(root);
            return root=rotateRight(root);
        }
        //right right case
        if(balanceFactor<-1 && key>root.right.data){
            return root=rotateLeft(root);
       
        }
        //left right case
        if(balanceFactor>1 && key>root.left.data){
            root.left=rotateLeft(root.left);
            return root=rotateRight(root);
        }
        //right left case
        if(balanceFactor<-1 && key<root.right.data){
            root.right=rotateRight(root.right);
            return root=rotateLeft(root);
        }
        return root;
    }
    public Node rotateLeft(Node root){
        Node rootRight=root.right;
        Node rootRight_Left=rootRight.left;
        
//        root=rootRight_Left;
        rootRight_Left.left=root;
        root.right=rootRight_Left;
        
        
        rootRight.height=1+Math.max(height(rootRight.left),height(rootRight.right));
        rootRight_Left.height=1+Math.max(height(rootRight_Left.left),height(rootRight_Left.right));

        return rootRight;
    }
    public Node rotateRight(Node root){
        Node rootLeft=root.left;
        Node rootLeft_Right=rootLeft.right;
        
//        root=rootRight_Left;
//        rootRight_Left.left=root;
        rootLeft.right=root;
        root.left=rootLeft_Right;
        
        rootLeft.height=1+Math.max(height(rootLeft.left),height(rootLeft.right));
        rootLeft_Right.height=1+Math.max(height(rootLeft_Right.left),height(rootLeft_Right.right));

        return rootLeft;
    }
}

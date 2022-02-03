package CSCI230.HW5;
/*
 Course: CSCI 230 
 Name: Hunter Monaghan
 Homework Assignment 5
 Problem deletion BST
*/

import javax.swing.tree.TreeNode;

// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(ixnt val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */

class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        //conditional if node is null then return it
        if(root == null) {
            return root;
        }
        //Conditional statement that compares if the key is greater than the node value
        if(key > root.val) {
            //if its greater then transverse right
            root.right = deleteNode(root.right, key);
             //else if interate left
        } else if(key < root.val) {
            root.left = deleteNode(root.left, key);
            //else compare 
        } else {
            //Conditional that compares left node is null and the right node is node 
            if(root.left == null && root.right == null) {
                //no child of the node then set node to null
                root = null;
                //else if the right node is not null then get the min val from right tree.
            } else if(root.right != null) {
                root.val = findMinRight(root);
                root.right = deleteNode(root.right, root.val);
                //else if the left node is not null then get the max value from the left sub tree
            } else if(root.left !=null) {
                root.val = findMaxLeft(root);
                root.left= deleteNode(root.left, root.val);
            }
        }
        //return node
        return root;

    }
    
    
    //This method will find the min node on the right tree
    private int findMinRight(TreeNode root) {
        root = root.right;
        //System.out.println(root);
        //System.out.println(root.right);
        while(root.left != null) {
            root = root.left;
        }
        
        return root.val;
    }
    
    
    //This method will find the most Max node on the left tree
    private int findMaxLeft(TreeNode root) {
        root = root.left;
        //System.out.println(root);
        //System.out.println(root.left);
        
        while(root.right != null) {
            root = root.right;
        }
        
        return root.val;
    }
}
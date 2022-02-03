package CSCI230.HW6;

import javax.swing.tree.TreeNode;

/*
 Course: CSCI 230 
 Name: Hunter Monaghan
 Homework Assignment 6
 Problem balancedBTS
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        //return the node and make sure its not equiv to -1; it has to be balanced
        return height(root) != -1;
    }
    
    
    public int height(TreeNode root){
        //test case to see if the root is null
        if(root == null)
            return 0;
            
        //declaring two integers of the left node and right node
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        //conditional statement that is a test case and will return -1 if true, else will return the output of the ternary statement 
        if(leftHeight == -1 || rightHeight == -1 || rightHeight - leftHeight > 1 || leftHeight - rightHeight > 1){
            return -1;
        }
        //else return 
    else
            //trying out a ternary statement instead of if/else
            return ( leftHeight >= rightHeight ? leftHeight + 1 : rightHeight + 1 );    
    
    }
    }
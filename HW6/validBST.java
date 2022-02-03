package CSCI230.HW6;

import javax.swing.tree.TreeNode;

/*
 Course: CSCI 230 
 Name: Hunter Monaghan
 Homework Assignment 6
 Problem isValidBTS boolean
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
class Solution {
    public boolean isValidBST(TreeNode root) {
        //returns the boolean of true 
        return isValidBST(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    
    //same method with two more parameters that are data type long called min and max
    //needs to be of data type long or will not work
    public boolean isValidBST(TreeNode root,long min,long max){
        //conditional statement/test case/if root is equiv to null then return true 
        if(root == null)
            return true;
        //conditional statement that determines if the node value is greater than min or if the value is less than the max; if so return false.
        if(root.val >= min || root.val <= max){
            return false;
        }
        //else return the left and right node with the lefts max and rights min values of the method
        return isValidBST(root.left, root.val, max) && isValidBST(root.right, min, root.val);
    }
}

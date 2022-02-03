package CSCI230.HW5;
import java.util.*;
import javax.swing.tree.TreeNode;

/*
 Course: CSCI 230 
 Name: Hunter Monaghan
 Homework Assignment 5
 Problem search BST
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
    //two paramters root as a TreeNode and val as an integer
    public TreeNode searchBST(TreeNode root, int val) {
        //conditional statement that compares the equivalency of the value of the root to the parameter value or to see if the root is null. 
        if ( root == null || root.val == val)
            //return root if true
            return root;
      //conditional statement that takes the paramter val and sees if its less than the value of the root.
        if(root.val > val)
            //recursion
            //return the node on the left 
            return searchBST(root.left, val);
        else
            //returns the node on the right 
            return searchBST(root.right, val);
    }
}

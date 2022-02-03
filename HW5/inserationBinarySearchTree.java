/*
 Course: CSCI 230 
 Name: Hunter Monaghn
 Homework Assignment 5
 Problem insert BST 
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

import java.util.*;
class Solution {
    //This method takes two parameters a Treenode root and an integer called val
    public TreeNode insertIntoBST(TreeNode root, int val) {
        //Making a new object called node and also making a clone of the root called current  
        TreeNode current = root;
        TreeNode node = new TreeNode(val);
        //if root is null return node 
        if (root == null) {
            return node;
        }
        //while current is not equivalent to null then keep looping 
        while (current != null) {
            //if the value of val is less than the value of current the proceed
            if (val < current.val) {
                //if the one on the left is null then current.left is now equal to the node 
                if (current.left == null) {
                    current.left = node;
                    //halts the execution of the loop
                    break;
                }
                current = current.left;
            } else {
                //if the current.right is null then make it equal to the node
                if (current.right == null) {
                    current.right = node;
                    //halts execution of the loop
                    break;
                }
                current = current.right;
            }
        }
        //just return
        return root;
    }
}


//RECURSIVE WAY
   /* public TreeNode insertIntoBST(TreeNode root, int val) {
       //case check
        if (root == null) {
            return new TreeNode(val);
        }
		// because of the BST
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }*/



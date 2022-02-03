package CSCI230.HW4;
/*
 Course: CSCI 230 
 Name: Hunter Monaghan
 Homework Assignment 4
 Problem Two-Sum
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //declaring a variable to check/test called confirm
        int confirm;
        //making a nested loop. First loop interates through the nums array while interating i by 1++
        for (int i = 0; i < nums.length; i++) {
            //this for loop will interate through nums.length while interating j by 1 each loop. Also delcared j = i + 1 because we want it 1 ahead of i
            for (int j = i + 1; j < nums.length; j++) {
                confirm = nums[i] + nums[j];
                //conditional statement comparing the test variable called confirmed to see if its equivalent to thetarget integer in the parameters, if so then..
                if (confirm == target) {
                    //returning the indices of the 2 numbers 
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}







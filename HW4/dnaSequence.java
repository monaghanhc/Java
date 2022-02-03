/*
 Course: CSCI 230 
 Name: Hunter Monaghan
 Homework Assignment 4
 Problem DNA sequence 
*/
package CSCI230.HW4;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        //Making a new object Hash Map using two data sets, a string and a integer and declaring it as map
        Map<String,Integer> map = new HashMap<>();
        //Making a new object Array List as a string called arL
        List<String> arL = new ArrayList<>();
        //Making a new object String Builder of the main string and declaring it as string
        StringBuilder string = new StringBuilder(s);
        

        
        //Looping through the string with its length minus 10 so its specific to 10 each while incrementing
        for(int i = 0; i <= s.length()-10; ++i){
            //declaring a substring of i and i + 10 for each sequence and its called 
            String cur = string.substring(i, i + 10);
            //using the built in function .getOrDefault in the HashMap class to get a value mapped with a specific key. while the .put() built-in method I used to put a mapping into a map. 
            map.put(cur,map.getOrDefault(cur, 0) + 1);
            //using a conditional statement that compares if the value mapped by the cur is equivalent by 2
            if(map.get(cur) == 2){
                //if so, add another key 
                arL.add(cur);
            }
        }
        return arL;
        
    }

}



/*
 Course: CSCI 230 
 Name: Hunter Monaghn
 Homework Assignment 3
 
*/
public class Solution {
    
    
    //Hash set way 
    public boolean hasCycle(ListNode head) {
        //Making a new Hashset Object called node
        HashSet<ListNode> node = new HashSet<>();
        
     while(head != null){
            //if the parameter passed in exist in the HashSet then return true 
            if(node.contains(head)){
                //return true if there is a cycle in the linked list
                return true;
            }else{//else add a new head
                node.add(head);
            }
            //to keep moving to the next container 
            head = head.next;
        }
        //otherwise, return false
        return false;
    }

 }
        
    


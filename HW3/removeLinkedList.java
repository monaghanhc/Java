import java.util.List;

/*
 Course: CSCI 230 
 Name: Hunter Monaghn
 Homework Assignment 3
 
*/

//The removeLinkedList() method will have a time complexity of O(1), still have to check what the worst case time complexity would be 


class Solution {
    //method to remove elemnts with taking in two parameters ListNode head and integer val
    public ListNode removeElements(ListNode head, int val) {
        //A new node object name specialValue
        List specialValue = new ListNode(0);
        specialValue.next = head;
        //Declaring two new nodes called previous and initial
        ListNode previous = specialValue;
        ListNode initial = head;
        while(initial != null){
            //conditional statement that will remove all the nodes of the linked list that is equivalent to the parameter val
            if(initial.val == val){
                previous.next = initial.next;
            }else{
                previous = initial;
            }
            initial = initial.next;
        }
        //will return the new head 
        return specialValue.next;
    }
}
        
    

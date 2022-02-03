package CSCI230.LinkedList.HW1;
import java.util.*;//double check this import 

/* File Three: Main Class */
public class Main2 {

    public static void main(String[] args) {

        /* Link Tow Nodes */
        // create two nodes
        Node first = new Node(10);
        Node second = new Node(20);
        // link them
        first.next = second;
        // test the list
        System.out.println("The value of first node is " + first.value);
        System.out.println("The value of next node is " + first.next.value);

        /* Build A Linked List Forward */
        // make a longer list forward
        Node head, tail, current; // two node references
        head = new Node(0);
        tail = head;
        for (int i = 1; i < 10; ++i) {
            current = new Node(i * 10); // create a new node
            tail.next = current; // link the new node after head
            tail = current;
        }

        // to print values in the list
        current = head;
        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.print("\n");

        /* Build A Linked List Forward */
        // make a longer list backward
        Node head2, current2; // two node references
        head2 = new Node(0);
        for (int i = 1; i < 10; ++i) {
            current2 = new Node(i * 10); // create a new node
            current2.next = head2; // link the new node after head
            head2 = current2;
        }

        // to print values in the list
        current2 = head2;
        while (current2 != null) {
            System.out.print(current2.value + "->");
            current2 = current2.next;
        }
        System.out.print("\n");

        /* test the SinglyLinkedList class */
        // create an empty list
        LinkedList2 myList = new LinkedList2();
        // add nodes backward
        for (int i = 1; i < 10; ++i) {
            myList.addNodeAtHead(i * 10);
        }
        // add nodes forward
        for (int i = 1; i < 10; ++i) {
            myList.addNodeAtTail(-i * 10);
        }
        // print
        myList.print();

        // delete value 30
        myList.deleteValue(30);
        myList.print();
        // ListNode newBall = new ListNode(val:15)
        System.out.println(myList.middle().value);

    }
}


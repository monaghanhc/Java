package CSCI230.LinkedList.HW1;

/* File Two: SinglyLinkedList Class */
public class LinkedList {
    Node head;
    Node tail;

    void addNodeAtHead(int value) {
        Node current = new Node(value);
        current.next = head;
        head = current;
        if (head.next == null)
            tail = head;
    }

    void addNodeAtTail(int value) {
        Node current = new Node(value);
        if (tail != null) {
            tail.next = current;
            tail = current;
        } else {
            head = tail = current;
        }
    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.print("\n");
    }

    

}


package CSCI230.LinkedList.HW1;
import java.util.*;//double check thisimport 

/* File Two: SinglyLinkedList Class */
public class LinkedList2 {
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

    void deleteHead() {
        if (head != null)
            head = head.next;
    }

    void deleteTail() {
        // linear time operation
        // case 1
        if (head == null)
            return;
        // case 2
        if (head == tail) {
            head = tail = null;
            return;
        }
        // case 3
        Node runner = head;
        while (runner.next != tail) {
            runner = runner.next;
        }
        tail = runner;
        runner.next = null;
    }

    Node deleteAt(Node runner) {
        // special cases...
        // Without taking care of special cases, program would cause runtime errors

        // general case
        runner.value = runner.next.value; // make current node a duplicate of the next node
        runner.next = runner.next.next; // spice out the next node
        return runner;
    }

    void deleteValue(int value) {
        Node runner = head; // professional name of the runner is iterator

        // special cases....
        // Without taking care of special cases, program would cause runtime errors

        // general case
        while (runner.next != tail) {
            if (runner.value == value) {
                runner = deleteAt(runner);
            }
            runner = runner.next;
        }
    }

    Node middle() {
        Node p1, p2;
        p1 = p2 = head;
        while (p1 != null && p1.next != null) {
            p1 = p1.next.next;
            p2 = p2.next;
        }
        return p2;
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


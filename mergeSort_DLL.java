import java.util.Scanner;

class Node {
    int data;
    Node next, prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

class Solution {
    // Split the list into two halves
    public Node split(Node head) {
        Node fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node temp = slow.next;
        slow.next = null;
        if (temp != null) {
            temp.prev = null;
        }
        return temp;
    }

    // Merge sort for the doubly linked list
    public Node mergeSort(Node node) {
        if (node == null || node.next == null)
            return node;

        Node second = split(node);
        node = mergeSort(node);
        second = mergeSort(second);

        return merge(node, second);
    }

    // Merge two sorted lists
    public Node merge(Node first, Node second) {
        if (first == null)
            return second;
        if (second == null)
            return first;

        if (first.data < second.data) {
            first.next = merge(first.next, second);
            if (first.next != null)
                first.next.prev = first;
            first.prev = null;
            return first;
        } else {
            second.next = merge(first, second.next);
            if (second.next != null)
                second.next.prev = second;
            second.prev = null;
            return second;
        }
    }
}

public class Main {
    // Print list from left to right
    public static void printList_left_right(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Print list from right to left
    public static void printList_right_left(Node head) {
        Node tail = head;
        // Traverse to the last node
        while (tail.next != null)
            tail = tail.next;

        // Print in reverse order
        while (tail != null) {
            System.out.print(tail.data + " ");
            tail = tail.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of nodes
        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();

        // Read the first node value
        System.out.print("Enter the node values: ");
        int val = sc.nextInt();
        Node head = new Node(val);

        // Build the doubly linked list
        Node current = head;
        for (int i = 1; i < n; i++) {
            val = sc.nextInt();
            Node nd = new Node(val);
            nd.next = current;
            current.prev = nd;
            current = nd;
        }
        head = current;

        // Perform merge sort
        Solution g = new Solution();
        Node res = g.mergeSort(head);

        // Print the sorted list
        System.out.println("List from left to right:");
        printList_left_right(res);

        System.out.println("List from right to left:");
        printList_right_left(res);
    }
}


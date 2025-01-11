import java.util.Scanner;

class Main {
    static class Node {
        int data;
        Node next;
        Node prev;
    }

    // Function to split a doubly linked list into two halves
    static Node split(Node head) {
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node second = slow.next;
        slow.next = null;
        if (second != null) {
            second.prev = null;
        }
        return second;
    }

    // Merge two sorted doubly linked lists
    static Node merge(Node first, Node second) {
        if (first == null) return second;
        if (second == null) return first;

        if (first.data <= second.data) {
            first.next = merge(first.next, second);
            first.next.prev = first;
            first.prev = null;
            return first;
        } else {
            second.next = merge(first, second.next);
            second.next.prev = second;
            second.prev = null;
            return second;
        }
    }

    // Sort a doubly linked list using merge sort
    static Node sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node second = split(head);
        head = sort(head);
        second = sort(second);
        return merge(head, second);
    }

    // Push a new node at the head of the list
    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.prev = null;
        new_node.next = head_ref;

        if (head_ref != null) {
            head_ref.prev = new_node;
        }

        head_ref = new_node;
        return head_ref;
    }

    // Print the list
    static void printlist(Node head) {
        if (head == null) {
            System.out.println("Doubly Linked list is empty");
            return;
        }

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Read the number of nodes
        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();

        Node head = null;

        System.out.println("Enter the node values: ");
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            head = push(head, m);
        }

        System.out.println("Original list:");
        printlist(head);

        head = sort(head);

        System.out.println("After sorting:");
        printlist(head);
    }
}


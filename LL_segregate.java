import java.util.*;

class Main {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Function to segregate even and odd nodes
    void segregateEvenOdd() {
        Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;
        Node currentNode = head;

        while (currentNode != null) {
            int element = currentNode.data;

            if (element % 2 == 0) { // Even node
                if (evenStart == null) {
                    evenStart = currentNode;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = currentNode;
                    evenEnd = evenEnd.next;
                }
            } else { // Odd node
                if (oddStart == null) {
                    oddStart = currentNode;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = currentNode;
                    oddEnd = oddEnd.next;
                }
            }
            currentNode = currentNode.next;
        }

        // If there are no even or odd nodes, return
        if (evenStart == null || oddStart == null) {
            return;
        }

        // Connect even list to odd list
        evenEnd.next = oddStart;
        oddEnd.next = null;

        // Update head to the start of the even list
        head = evenStart;
    }

    // Function to push a new node at the head of the list
    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Function to print the list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        // Read the number of nodes
        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter the node values:");
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            main.push(m);
        }

        System.out.println("Original List:");
        main.printList();

        main.segregateEvenOdd();

        System.out.println("List after segregation:");
        main.printList();
    }
}

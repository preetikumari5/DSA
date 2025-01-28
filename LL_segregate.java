import java.util.*;
import java.util.*;
class Main {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }
    Node head, evenStart, evenEnd, oddStart, oddEnd;
    void segregateEvenOdd() {
        Node current = head;
        while (current != null) {
            if (current.data % 2 == 0) { // Even
                if (evenStart == null) evenStart = evenEnd = current;
                else { evenEnd.next = current; evenEnd = current; }
            } else { // Odd
                if (oddStart == null) oddStart = oddEnd = current;
                else { oddEnd.next = current; oddEnd = current; }
            }
            current = current.next;
        }
        if (evenStart == null || oddStart == null) return;
        evenEnd.next = oddStart;
        oddEnd.next = null;
        head = evenStart;
    }
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void printList() {
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Main list = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter the node values:");
        while (n-- > 0) list.push(sc.nextInt());

        System.out.println("Original List:");
        list.printList();
        list.segregateEvenOdd();
        System.out.println("List after segregation:");
        list.printList();
    }
}


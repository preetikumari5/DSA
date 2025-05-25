public class DoubleLinkedList {

    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;

    // Constructor to initialize an empty list
    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    // Insert a node at the beginning
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Print list from head to tail
    public void printListForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    // Print list from tail to head
    public void printListBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data);
            if (current.prev != null) {
                System.out.print(" -> ");
            }
            current = current.prev;
        }
        System.out.println();
    }

    // Main method to test it
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertAtFirst(5);
        dll.insertAtFirst(10);
        dll.insertAtFirst(15);

        System.out.println("Forward:");
        dll.printListForward();

        System.out.println("Backward:");
        dll.printListBackward();
    }
}

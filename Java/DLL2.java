public class DLL2 {

    private class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    // Constructor
    public DLL2() {
        head = null;
        tail = null;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println();
            return;
        }
        Node temp = head;
        System.out.print("NULL <--> ");
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Display reverse
    public void displayReverse() {
        if (head == null) {
            System.out.println();
            return;
        }
        Node temp = tail;
        System.out.print("NULL <--> ");
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }

    // Insert at a specific position (1-based)
    public void insertAt(int data, int pos) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            displayForward();
            return;
        }

        Node temp = head;
        int position = 1;

        while (temp != null && position != pos - 1) {
            temp = temp.next;
            position++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            // if inserting at end
            tail = newNode;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;

        displayForward();
    }

    // Delete element by value (first occurrence)
    public void deleteElement(int data) {
        if (head == null) return;

        Node temp = head;

        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Element not found.");
            return;
        }

        if (temp == head) {
            deleteFirstElement();
            return;
        } else if (temp == tail) {
            deleteLastElement();
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        displayForward();
    }

    // Delete first element
    public void deleteFirstElement() {
        if (head == null) return;

        Node temp = head;
        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }

        displayForward();
    }

    // Delete last element
    public void deleteLastElement() {
        if (tail == null) return;

        Node temp = tail;
        tail = tail.prev;

        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }

        displayForward();
    }

    // Main function to test the list
    public static void main(String[] args) {
        DLL2 list = new DLL2();
        list.insertAtBeginning(5);
        list.insertAtBeginning(0);
        list.insertAtEnd(10);
        list.displayForward();
        list.displayReverse();

        // Additional operations you can test:
        // list.insertAt(7, 2);
        // list.deleteElement(5);
        // list.deleteFirstElement();
        // list.deleteLastElement();
    }
}

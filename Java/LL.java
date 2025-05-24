class MyLinkedList {

    private class Node {
        int data;
        Node next;
    }

    private Node head;

    // Constructor
    MyLinkedList() {
        head = null;
    }

    // Prints list
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print("->");
            }
            current = current.next;
        }
        System.out.println();
    }

    // Search for data
    int search(int data) {
        Node current = head;
        int position = 1;
        while (current != null) {
            if (current.data == data) {
                return position;
            }
            position++;
            current = current.next;
        }
        return -1;
    }

    // Get size
    int size() {
        Node current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    // Insert at head
    void insertAtFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Insert at position
    void insert(int data, int position) {
        if (position < 1 || position > size() + 1) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node();
        newNode.data = data;
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete first element
    void deleteFirstElement() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Delete last element
    void deleteLastElement() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Delete specific element
    void deleteElement(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Element not found");
            return;
        }
        current.next = current.next.next;
    }

    // Reverse list
    void reverseList() {
        Node prev = null, current = head, nextNode;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
    }

    // Delete entire list
    void deleteList() {
        head = null;
    }

    // Main method to test
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        System.out.println(obj.size());
        obj.printList();
        obj.insertAtEnd(5);
        obj.printList();
        obj.insertAtFirst(10);
        obj.printList();
        obj.insert(12, 2);
        obj.printList();
        obj.insertAtFirst(4);
        obj.printList();
        obj.insert(56, 3);
        obj.printList();
        System.out.println(obj.search(12));
        System.out.println(obj.search(15));
        obj.reverseList();
        obj.printList();
        System.out.println(obj.size());
        obj.deleteFirstElement();
        obj.printList();
        obj.deleteElement(10);
        obj.printList();
        obj.deleteLastElement();
        obj.printList();
        obj.deleteList();
        obj.printList();
        System.out.println(obj.size());
    }
}

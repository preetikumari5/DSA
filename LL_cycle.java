import java.util.*;
class Node {
    int num;
    Node next;
    Node(int val) {
        num = val;
        next = null;
    }
}

class Main {
    static Node insertNode(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    static void display(Node head) {
        Node temp = head;
        HashSet<Node> visited = new HashSet<>(); // To handle cycles during display
        while (temp != null) {
            if (visited.contains(temp)) {
                System.out.print(temp.num + "->Cycle");
                return;
            }
            visited.add(temp);
            System.out.print(temp.num + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    static void createCycle(Node head, int position) {
        if (head == null || position == -1) return; // Skip cycle creation if invalid position

        Node target = head;
        int count = 1; // Position is 1-based indexing

        // Move to the target position
        while (target != null && count < position) {
            target = target.next;
            count++;
        }

        // If the position is valid, link the last node to the target node
        if (target != null) {
            Node temp = head;
            while (temp.next != null) { // Move to the last node
                temp = temp.next;
            }
            temp.next = target; // Create the cycle
        }
    }

    static boolean cycleDetect(Node head) {
        if (head == null) return false;
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input number of nodes
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null;
        System.out.println("Enter node values: ");
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            head = insertNode(head, m);
        }

        System.out.println("Linked list:");
        display(head);

        // Input position for cycle creation
        System.out.println("\nEnter a position to create a cycle (use -1 for no cycle):");
        int position = sc.nextInt();

        createCycle(head, position);

        // Check and display if a cycle exists
        if (cycleDetect(head)) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("Cycle not detected");
        }
    }
}

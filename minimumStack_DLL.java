import java.util.*;

class Mystack {
    Stack<Integer> s; // Main stack
    Stack<Integer> a; // Auxiliary stack to track minimum

    Mystack() {
        s = new Stack<>();
        a = new Stack<>();
    }

    // Function to get the minimum element
    void getMin() {
        if (a.isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Minimum element: " + a.peek());
        }
    }

    // Function to get the top element
    void peek() {
        if (s.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        int t = s.peek();
        System.out.println("Topmost element: " + t);
    }

    // Function to remove the top element
    void pop() {
        if (s.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        int t = s.pop();
        System.out.println("Removed element: " + t);
        if (t == a.peek()) {
            a.pop();
        }
    }

    // Function to add an element to the stack
    void push(int x) {
        s.push(x);
        System.out.println("Number Inserted: " + x);
        if (a.isEmpty() || x <= a.peek()) {
            a.push(x);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Mystack s = new Mystack();
        Scanner sc = new Scanner(System.in);

        // Input number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            s.push(m);
        }

        // Test stack operations
        s.getMin(); // Print the minimum element
        s.pop();    // Remove the top element
        s.getMin(); // Print the minimum element
        s.pop();    // Remove the top element
        s.peek();   // Print the topmost element
    }
}

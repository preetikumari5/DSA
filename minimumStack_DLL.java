import java.util.*;
class Mystack {
    Stack<Integer> s; 
    Stack<Integer> a; 
    Mystack() {
        s = new Stack<>();
        a = new Stack<>();
    }
    void getMin() {
        if (a.isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Minimum element: " + a.peek());
        }
    }
    void peek() {
        if (s.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        int t = s.peek();
        System.out.println("Topmost element: " + t);
    }
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
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            s.push(m);
        }
        s.getMin(); 
        s.pop();    
        s.getMin(); 
        s.pop();    
        s.peek();   
    }
}

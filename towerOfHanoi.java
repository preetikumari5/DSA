import java.util.*;

class Main {

    // Stack class for managing disks
    static class Stack {
        int capacity;
        int top;
        int[] array;

        // Constructor
        Stack(int capacity) {
            this.capacity = capacity;
            this.top = -1;
            this.array = new int[capacity];
        }
    }

    // Create a stack
    static Stack createStack(int capacity) {
        return new Stack(capacity);
    }

    // Check if the stack is full
    static boolean isFull(Stack stack) {
        return (stack.top == stack.capacity - 1);
    }

    // Check if the stack is empty
    static boolean isEmpty(Stack stack) {
        return (stack.top == -1);
    }

    // Push an item onto the stack
    static void push(Stack stack, int item) {
        if (isFull(stack)) {
            return;
        }
        stack.array[++stack.top] = item;
    }

    // Pop an item from the stack
    static int pop(Stack stack) {
        if (isEmpty(stack)) {
            return Integer.MIN_VALUE;
        }
        return stack.array[stack.top--];
    }

    // Move a disk between two stacks
    static void moveDisk(Stack source, Stack destination, char s, char d) {
        int fromDisk = pop(source);
        int toDisk = pop(destination);

        // Case 1: Source is empty
        if (fromDisk == Integer.MIN_VALUE) {
            push(source, toDisk);
            System.out.println("Move the disk " + toDisk + " from " + d + " to " + s);
        }
        // Case 2: Destination is empty
        else if (toDisk == Integer.MIN_VALUE) {
            push(destination, fromDisk);
            System.out.println("Move the disk " + fromDisk + " from " + s + " to " + d);
        }
        // Case 3: Source disk is larger than destination disk
        else if (fromDisk > toDisk) {
            push(source, fromDisk);
            push(source, toDisk);
            System.out.println("Move the disk " + toDisk + " from " + d + " to " + s);
        }
        // Case 4: Destination disk is larger than source disk
        else {
            push(destination, toDisk);
            push(destination, fromDisk);
            System.out.println("Move the disk " + fromDisk + " from " + s + " to " + d);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of disks
        System.out.print("Enter the number of disks: ");
        int numDisks = sc.nextInt();

        if (numDisks <= 0) {
            System.out.println("Invalid number of disks. Must be greater than 0.");
            return;
        }

        // Create stacks for source, auxiliary, and destination
        Stack source = createStack(numDisks);
        Stack auxiliary = createStack(numDisks);
        Stack destination = createStack(numDisks);

        char s = 'S', d = 'D', a = 'A';

        // Swap auxiliary and destination for even number of disks
        if (numDisks % 2 == 0) {
            char temp = d;
            d = a;
            a = temp;
        }

        // Total number of moves
        int totalMoves = (int) (Math.pow(2, numDisks) - 1);

        // Push disks onto the source stack
        for (int i = numDisks; i >= 1; i--) {
            push(source, i);
        }

        // Perform the moves
        for (int i = 1; i <= totalMoves; i++) {
            if (i % 3 == 1) {
                moveDisk(source, destination, s, d);
            } else if (i % 3 == 2) {
                moveDisk(source, auxiliary, s, a);
            } else if (i % 3 == 0) {
                moveDisk(auxiliary, destination, a, d);
            }
        }
    }
}

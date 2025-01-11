import java.util.*;

public class Main {
    // Function to determine the celebrity
    public static int findCelebrity(int[][] mat) {
        Stack<Integer> stack = new Stack<>();

        // Push all individuals to the stack
        for (int i = 0; i < mat.length; i++) {
            stack.push(i);
        }

        // Find a potential celebrity
        while (stack.size() > 1) {
            int personA = stack.pop();
            int personB = stack.pop();

            // If personA knows personB, personA cannot be the celebrity
            if (mat[personA][personB] == 1) {
                stack.push(personB);
            } else {
                // If personA does not know personB, personB cannot be the celebrity
                stack.push(personA);
            }
        }

        // The remaining person in the stack is a potential celebrity
        int potentialCelebrity = stack.pop();

        // Verify if the potential celebrity is a true celebrity
        for (int i = 0; i < mat.length; i++) {
            if (i != potentialCelebrity) {
                // A celebrity knows nobody, and everyone must know the celebrity
                if (mat[potentialCelebrity][i] == 1 || mat[i][potentialCelebrity] == 0) {
                    return -1; // No celebrity
                }
            }
        }

        return potentialCelebrity; // Celebrity found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of people (size of matrix)
        System.out.print("Enter the number of people: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of people.");
            return;
        }

        int[][] matrix = new int[n][n];
        System.out.println("Enter the " + n + "x" + n + " matrix (0 or 1):");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Find the celebrity
        int result = findCelebrity(matrix);

        if (result == -1) {
            System.out.println("There is no celebrity in the party.");
        } else {
            System.out.println("Person " + result + " is the celebrity in the party.");
        }
    }
}

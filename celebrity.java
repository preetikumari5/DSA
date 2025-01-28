import java.util.*;
public class Main {
    public static int findCelebrity(int[][] mat) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < mat.length; i++) {
            stack.push(i);
        }
        while (stack.size() > 1) {
            int personA = stack.pop();
            int personB = stack.pop();
            if (mat[personA][personB] == 1) {
                stack.push(personB);
            } else {
                stack.push(personA);
            }
        }
        int potentialCelebrity = stack.pop();
        for (int i = 0; i < mat.length; i++) {
            if (i != potentialCelebrity) {
                if (mat[potentialCelebrity][i] == 1 || mat[i][potentialCelebrity] == 0) {
                    return -1; 
                }
            }
        }
        return potentialCelebrity; // Celebrity found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int result = findCelebrity(matrix);
        if (result == -1) {
            System.out.println("There is no celebrity in the party.");
        } else {
            System.out.println("Person " + result + " is the celebrity in the party.");
        }
    }
}

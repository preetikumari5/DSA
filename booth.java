import java.util.Scanner;

public class Booth {
    public int multiply(int n1, int n2) {
        int multiplicand = n1; // Multiplicand
        int multiplier = n2;   // Multiplier
        int A = multiplicand;  // Initialize A to multiplicand
        int S = -multiplicand; // Initialize S to negative of multiplicand
        int P = 0;             // Product initialized to 0
        int count = Integer.SIZE; // Number of bits for multiplication
        int Q = multiplier;     // Copy of multiplier
        int Q_1 = 0;            // Q-1 initialized to 0

        while (count > 0) {
            // Check the last bit of Q and Q-1
            if ((Q & 1) == 1 && Q_1 == 0) {
                // Add A to the product
                P += A;
            } else if ((Q & 1) == 0 && Q_1 == 1) {
                // Subtract S from the product
                P += S;
            }

            // Shift right (A, Q, Q-1)
            Q_1 = Q & 1; // Save the last bit of Q
            Q >>= 1;     // Right shift Q
            Q |= (P & 1) << (Integer.SIZE - 1); // Fill the new bit in Q from the product
            P >>= 1;     // Right shift the product
            count--;     // Decrease the bit count
        }

        return P; // Return the final product
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Booth boothMultiplier = new Booth();

        System.out.println("Enter two integer numbers:");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        int result = boothMultiplier.multiply(n1, n2);

        System.out.println("\nResult: " + n1 + " * " + n2 + " = " + result);
        scan.close();
    }
}

import java.util.Scanner;
public class EPA {  
    // Method to calculate Euler's Totient function (phi function)
    public static int phi(int n) {
        int result = n;  // Initialize result as n
        
        // Check every number from 2 to sqrt(n)
        for (int p = 2; p * p <= n; p++) {
            // Check if p is a divisor of n
            if (n % p == 0) {
                // Remove all factors of p from n
                while (n % p == 0) {
                    n = n / p;
                }
                // Apply Euler's Totient function formula
                result = result - (result / p);
            }
        }
        
        // If n is greater than 1, then it's a prime factor greater than sqrt(original n)
        if (n > 1) {
            result = result - result / n;
        }
        
        return result;  // Return the calculated phi value
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer n: ");
        int n = sc.nextInt();  // Input the value of n
        
        int phi_n = phi(n);  // Calculate phi(n)
        
        System.out.println("phi(" + n + ") = " + phi_n);  // Print the result
    }
}


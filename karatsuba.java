import java.util.*;

class Main {
    public static long karatsuba(long x, long y) {
        // Base case for recursion
        if (x < 10 || y < 10) {
            return x * y;
        }

        // Calculate the number of digits
        int n = Math.max(Long.toString(x).length(), Long.toString(y).length());
        int half = (n + 1) / 2;

        // Split the input numbers
        long a = x / (long) Math.pow(10, half);
        long b = x % (long) Math.pow(10, half);
        long c = y / (long) Math.pow(10, half);
        long d = y % (long) Math.pow(10, half);

        // Recursive calls
        long ac = karatsuba(a, c);           // ac
        long bd = karatsuba(b, d);           // bd
        long adbc = karatsuba(a + b, c + d) - ac - bd; // (a+b)(c+d) - ac - bd

        // Combine the results
        return (long) (ac * Math.pow(10, 2 * half) + adbc * Math.pow(10, half) + bd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        long x = sc.nextLong();
        System.out.print("Enter second number: ");
        long y = sc.nextLong();
        
        long res = karatsuba(x, y);
        System.out.println("Result: " + res);
        sc.close();
    }
}

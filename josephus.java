import java.util.Scanner;

class Main {
    static int josephus(int n, int k) {
        if (n == 1)
            return 1;
        else
            return (josephus(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept user input for number of people (n)
        System.out.println("Enter the number of people (n):");
        int n = scanner.nextInt();
        
        // Accept user input for step rate (k)
        System.out.println("Enter the step rate (k):");
        int k = scanner.nextInt();

        System.out.println("The chosen place is " + josephus(n, k));
    }
}

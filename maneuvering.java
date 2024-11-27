import java.util.Scanner;

class Main {
    static int numberOfPaths(int m, int n) {
        if (m == 1 || n == 1)
            return 1;
        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows (m):");
        int m = scanner.nextInt();
        System.out.println("Enter the number of columns (n):");
        int n = scanner.nextInt();

        System.out.println("Number of paths: " + numberOfPaths(m, n));
    }
}

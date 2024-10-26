// array left rotation
import java.util.Scanner;
public class Main {
    // Utility function to swap d elements starting from index start1 and start2
    public static void swap(int[] arr, int start1, int start2, int d) {
        for (int i = 0; i < d; i++) {
            int temp = arr[start1 + i];
            arr[start1 + i] = arr[start2 + i];
            arr[start2 + i] = temp;
        }
    }
    // Block Swap Algorithm to rotate the array
    public static void leftRotate(int[] arr, int d, int n) {
        // If no rotation is needed
        if (d == 0 || d == n) {
            return;
        }
        // If the first block is smaller or equal to the second block
        if (d < n - d) {
            // Swap the first d elements with the last d elements
            swap(arr, 0, n - d, d);
            // Recursively rotate the remaining part of the array
            leftRotate(arr, d, n - d);
        }
        // If the second block is smaller
        else {
            // Swap the first (n - d) elements with the last (n - d) elements
            swap(arr, 0, d, n - d);
            // Recursively rotate the remaining part of the array
            leftRotate(arr, n - d, d);
        }
    }
    // Function to print the array
    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of array and number of rotations
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter number of positions to rotate: ");
        int d = sc.nextInt();

        // Input: elements of the array
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Rotate the array using block swap algorithm
        leftRotate(arr, d, n);

        // Output: rotated array
        System.out.println("Rotated array:");
        printArray(arr, n);

        sc.close();
    }
}
 
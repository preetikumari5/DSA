import java.util.*;

class Main {
    static void findSecondMin(int[] arr, int n) {
        if (n < 2) {
            System.out.println("Not enough elements to find second minimum.");
            return;
        }

        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num > firstMin && num < secondMin) {
                secondMin = num;
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second minimum found.");
        } else {
            System.out.println("Minimum: " + firstMin + ", Second Minimum: " + secondMin);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        findSecondMin(arr, n);
    }
}

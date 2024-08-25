// chinese remainder thoerem

import java.util.Scanner;

class CRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of divisors: ");
        int size = sc.nextInt();

        int[] div = new int[size];
        System.out.println("Enter the divisors: ");
        for (int i = 0; i < size; i++) {
            div[i] = sc.nextInt();
        }

        System.out.println("Enter the remainders: ");
        int[] rem = new int[size];
        for (int i = 0; i < size; i++) {
            rem[i] = sc.nextInt();
        }

        CR c = new CR();
        System.out.println("The solution is: " + c.calculate(size, div, rem));
    }
}

class CR {
    int calculate(int size, int div[], int rem[]) {
        int x = 1;
        while (true) {
            int j;
            for (j = 0; j < size; j++) {
                if (x % div[j] != rem[j]) {
                    break;
                }
            }
            // If j equals size, it means all congruences are satisfied
            if (j == size) {
                return x;
            }
            x++;
        }
    }
}

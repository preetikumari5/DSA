import java.util.*;

public class ToggleSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] b = new boolean[n + 1]; // Array to track door states
        int o = 0; // Counter for open doors
        int c = 0; // Counter for closed doors

        // Toggle doors based on the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                b[j] = !b[j]; // Toggle the state of door j
            }
        }


        // Count open and closed doors
        for (int i = 1; i <= n; i++) {
            if (b[i]) {
                o++; // Door is open
            } else {
                c++; // Door is closed
            }
        }

        // Output the results
        System.out.println("No Of Doors open: " + o);
        System.out.println("No Of Doors closed: " + c);

        // Close the scanner
        sc.close();
    }
}


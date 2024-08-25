import java.util.*;

public class ToggleSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] b = new boolean[n + 1]; // Array to track door states
        int c = 0; // Counter for open doors
        int o = 0; // Counter for closed doors

        // Toggle doors based on the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                b[j] = !b[j]; // Toggle the state of door j
            }
        }

        // Count open and closed doors
        for (int i = 1; i <= n; i++) {
            if (b[i]) {
                c++; // Door is open
            } else {
                o++; // Door is closed
            }
        }

        // Output the results
        System.out.println("No Of Doors open: " + c);
        System.out.println("No Of Doors closed: " + o);

        // Close the scanner
        sc.close();
    }
}


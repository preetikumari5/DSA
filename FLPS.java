// find longest plaindromic substring
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String text = scanner.nextLine();
        if (text.isEmpty()) {
            System.out.println("No input provided.");
            return;
        }
        System.out.println("Longest Palindromic Substring: " + findLongestPalindromicString(text));
    }
    static String findLongestPalindromicString(String text) {
        int N = text.length();
        int[] L = new int[2 * N + 1];
        int C = 0, R = 0, maxLen = 0, center = 0;

        for (int i = 1; i < L.length; i++) {
            int mirror = 2 * C - i;
            L[i] = (i < R) ? Math.min(R - i, L[mirror]) : 0;

            while (i + L[i] + 1 < L.length && i - L[i] - 1 >= 0 &&
                   ((i + L[i] + 1) % 2 == 0 || 
                    text.charAt((i + L[i] + 1) / 2) == text.charAt((i - L[i] - 1) / 2))) {
                L[i]++;
            }
            if (i + L[i] > R) {
                C = i;
                R = i + L[i];
            }
            if (L[i] > maxLen) {
                maxLen = L[i];
                center = i;
            }
        }
        int start = (center - maxLen) / 2;
        return text.substring(start, start + maxLen);
    }
}

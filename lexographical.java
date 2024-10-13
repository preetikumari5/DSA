import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        int len = s.length();
        int max = 26;
        int freq[] = new int[max];

        for (int i = 0; i < len; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        if (CanMakePalindrome(freq, max, len) == false) {
            System.out.println("No palindromic string");
            System.exit(0);
        }

        String odd_str = "";
        for (int i = 0; i < max; i++) {
            if (freq[i] % 2 != 0) {
                freq[i]--;
                odd_str = odd_str + (char)(i + 'a');
            }
        }

        String f = "", r = "";
        for (int i = 0; i < max; i++) {
            if (freq[i] != 0) {
                String temp = "";
                char ch = (char) (i + 'a');
                for (int j = 1; j <= freq[i] / 2; j++) {
                    temp = temp + ch;
                }
                f = f + temp;
                r = temp + r;
            }
        }

        System.out.println(f + odd_str + r);
    }

    public static boolean CanMakePalindrome(int freq[], int max, int len) {
        int odd_cnt = 0;
        for (int i = 0; i < max; i++) {
            if (freq[i] % 2 != 0) {
                odd_cnt++;
            }
        }
        if (len % 2 == 0) {
            return odd_cnt == 0;
        } else {
            return odd_cnt == 1;
        }
    }
}


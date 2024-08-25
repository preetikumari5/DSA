// number rotated by 180 degree

import java.io.*;
import java.util.*;

public class StrobogrammaticNumber {
// Function to check if a given number is strobogrammatic
    static boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<>();
        map.put('6', '9');
        map.put('9', '6');
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');

        int l = 0, r = num.length() - 1;
        while (l <= r) {
            if (!map.containsKey(num.charAt(l))) return false;
            if (map.get(num.charAt(l)) != num.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    // Function to print all strobogrammatic numbers in a given range
    static void printStrobogrammaticInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            String numStr = Integer.toString(i);
            if (isStrobogrammatic(numStr)) {
                System.out.println(numStr);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
      
        printStrobogrammaticInRange(start, end);
    }
}
// swapping nibbles

import java.util.*;
public class Main {
    public static int swap(int x)
    {
        int left = (x & 0xF0) >> 4;
        int right = (x & 0x0F) << 4;
        return (right | left);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = swap(num);
        System.out.println(result);
        
    }
} 


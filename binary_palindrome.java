// binary palindrome

import java.util.*;
class Main {
    public static boolean isPalindrome(int x)
    {
        String binaryString = Integer.toBinaryString(x);
        
        int left = 0 , right = binaryString.length() -1;
        while(left<right)
        {
            if(binaryString.charAt(left)!=binaryString.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean f = isPalindrome(n);
        if(f)
        {
            System.out.println("it has binary palindrome representation");
        }
        else
        {
            System.out.println("it does not have binary palindrome representation");
        }
    }
}


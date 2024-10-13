// Longest Sequence of 1 after flipping a bit

import java.util.*;
public class Main {
    public static int flipBit(int n)
    {
        String binary = Integer.toBinaryString(n);
        int currentLength = 0;
        int previousLength = 0;
        int maxLength = 0;
        for(char bit : binary.toCharArray()) 
        {
            if(bit=='1')
            {
                currentLength++;
            }
            else
            {
                maxLength = Math.max(previousLength+currentLength+1 , maxLength);
                previousLength = currentLength;
                currentLength = 0;
            }
        }
        maxLength = Math.max(previousLength+currentLength+1 , maxLength);
        return maxLength;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(flipBit(n));
    }
}
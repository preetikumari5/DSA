// maximum subarray product

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = arr[0] , m =arr[0] , min = arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<0)
            {
                int temp = max;
                max = min;
                min = temp;
            }
            
            max = Math.max(arr[i],max*arr[i]);
            min = Math.min(arr[i],min*arr[i]);
            
            m = Math.max(m,max);
        }
        System.out.println(m);
    }
}
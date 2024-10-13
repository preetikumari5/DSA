import java.util.*;
public class Main {
    public static int max_Sum(int[] arr){
        int totalSum = 0;
        int leftSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            totalSum+=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            totalSum -= arr[i];
            if(leftSum==totalSum && totalSum > maxSum)
            {
                maxSum = leftSum;
            }
            leftSum += arr[i];
        }
        return maxSum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = max_Sum(arr);
        System.out.println(sum);
    }
}

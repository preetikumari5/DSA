// combination
import java.util.*;
public class Main 
{
    public static int fact(int n)
    {
        int f = 1;
        if(n==1 || n==0) return 1;
        for(int i=1;i<=n;i++)
        {
            f = f*i;
        }
        return f;
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
        int r = sc.nextInt();
        int result = fact(n) / (fact(n-r)*fact(r));
        System.out.println(result);
    }
}

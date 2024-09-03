// prime number from 2 to n
import java.util.*;
public class SieveMain{
    public static void SimpleSieve(int n)
    {
        boolean prime[] = new boolean[n+1];
        for(int i=2;i<=n;i++)
        {
            prime[i] = true;
        }
        for(int p=2;p*p<=n;p++)
        {
            if(prime[p]==true)
            {
                for(int j=p*p;j<=n;j+=p)
                {
                    prime[j] = false;
                }
            }
        }
        for(int p=2;p<=n;p++){
            if(prime[p]==true){
                System.out.print(p+ " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        SimpleSieve(a);
    }
}


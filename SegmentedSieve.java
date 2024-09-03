// prime  number in a range

import java.util.*;
public class SegmentedSieve {
    public static void SegSieve(int l,int h)
    {
        boolean prime[] = new boolean[h+1];
        for(int p=2;p*p<=h;p++)
        {
            int sm = p*p;
            if(sm<l)
            {
                sm = ((l+p-1)/p)*p;
            }
            for(int i = sm;i<=h;i+=p){
                prime[i] = true;
            }
        }
        for(int i=l;i<=h;i++)
        {
            if(prime[i]==false)
            {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        SegSieve(a, b);
    }
}



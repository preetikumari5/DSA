// Chinese Remainder Theorem

import java.util.*;
public class CRT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // number of divisors
        int d = sc.nextInt();
        // divisors array
        int[] div = new int[d];
        // enter divisors
        for(int i=0;i<d;i++){
            div[i] = sc.nextInt();
        }

        // remainder array
        int[] rem = new int[d];
        // enter remainders
        for(int i=0;i<d;i++){
            rem[i] = sc.nextInt();
        }

        CR c = new CR();
        System.out.println(c.calculate(d,div,rem));
    }
}

class CR {
    int calculate(int n,int div[],int rem[]){
        int x = 1;
        while(true)
        {
            for(int j=0;j<n;j++){
                if(x%div[j]!=rem[j]){
                    break;
                }
            }
            if(j==n){
                return x;
            }
            x++;
        }
    }
}

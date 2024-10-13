import java.util.*;
public class Main{
    public static void Leaders(int[] arr)
    {
        int n = arr.length;
        ArrayList<Integer> leaders = new ArrayList<>();
        int maxRight = arr[n-1];
        leaders.add(maxRight);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>maxRight)
            {
                leaders.add(arr[i]);
                maxRight = arr[i];
            }
        }
        for(int i=leaders.size()-1;i>=0;i--)
        {
            System.out.print(leaders.get(i));
            if(i>0)
            {
                System.out.print(" ");
            }
        }
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
        Leaders(arr);
    }
}

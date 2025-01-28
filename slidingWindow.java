// sliding window
import java.util.*;
public class Main {
    public static int[] maxSliding(int[] in, int w) {
        int n = in.length;
        int[] result = new int[n - w + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (!deque.isEmpty() && deque.peekFirst() < i - w + 1) deque.pollFirst();
            while (!deque.isEmpty() && in[deque.peekLast()] <= in[i]) deque.pollLast();
            deque.addLast(i);
            if (i >= w - 1) result[i - w + 1] = in[deque.peekFirst()];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int[] ans = maxSliding(a, k);
        for (int max : ans) System.out.print(max + " ");
    }
}


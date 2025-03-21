// sort without extra space
import java.util.*;

class Main {
    public static int minIndex(Queue<Integer> list, int sortIndex) {
        int min_index = -1;
        int min_value = Integer.MAX_VALUE;
        int s = list.size();
        for (int i = 0; i < s; i++) {
            int current = list.peek();
            list.poll();
            if (current <= min_value && i <= sortIndex) {
                min_index = i;
                min_value = current;
            }
            list.add(current);
        }
        return min_index;
    }
    public static void insertMinToRear(Queue<Integer> list, int min_index) {
        int min_value = 0;
        int s = list.size();

        for (int i = 0; i < s; i++) {
            int current = list.peek();
            list.poll();

            if (i != min_index) {
                list.add(current);
            } else {
                min_value = current;
            }
        }
        list.add(min_value);
    }
    public static void sortQueue(Queue<Integer> list) {
        for (int i = 1; i <= list.size(); i++) {
            int min_index = minIndex(list, list.size() - i);
            insertMinToRear(list, min_index);
        }
    }
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        list.add(6);
        list.add(11);
        list.add(15);
        list.add(4);
        sortQueue(list);
        while (!list.isEmpty()) {
            System.out.print(list.peek() + " ");
            list.poll();
        }
    }
}




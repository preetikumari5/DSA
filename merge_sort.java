// merge sort using DLL
import java.util.*;

import org.w3c.dom.Node;
public class Main{
    public Node split(Node head)
    {
        Node fast = head,slow=head;
        while(fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node temp = slow.next;
        slow.next = null;
        return temp;
    }
    public Node mergeSort(Node node)
    {
        if(node==null || node.next==null)
        {
            return node;
        }
        Node second = split(node);
        node = mergeSort(node);
        second = mergeSort(second);
        return merge(node,second);
    }
    public Node merge(Node first,Node second)
    {
        if(first==null) return second;
        if(second==null) return first;
        if(first.data < second.data){
            first.next = merge(first.next,second);
            first.next.prev = first;
            first.prev = null;
            return first;
        }
        else
        {
            second.nexxt = merge(first,second.next);
            second.next.prev=second;
            second.prev = null;
            return second;
        }
    }
    public static void printList_left_right(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void printList_right_left(Node head)
    {
        Node tail = head;
        while(tail,next!=null)
        {
            tail = tsil.next;
        }
        while (tail!=null) 
        {
            System.out.print(tail.data + " ");
            tail = tail.prev;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = sc.nextInt();
        Node head = new Node(val);
        for(int i=0;i<n;i++)
        {
            val = sc.nextInt();
            Node nd = new Node(val);
            nd.next = head;
            head=nd;
        }
    }
}


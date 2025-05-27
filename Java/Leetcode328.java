// Odd Even Linked List

public class Leetcode328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = head;
        if(head==null ||head.next==null) return head;
        ListNode even = head.next;
        ListNode evenHead = head.next;
        while(even!=null  && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}

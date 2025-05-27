// delete middle node of LL

public class Leetcode2095 {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast  = head;
        if(head==null || head.next==null) return null;
        fast = fast.next.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

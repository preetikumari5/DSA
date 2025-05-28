// rotate list by k places

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode NthNode(ListNode head, int k){
        int cnt = 1;
        while(head!=null){
            if(cnt==k) return head;
            cnt++;
            head = head.next;
        }
        return head;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        ListNode tail = head;
        int l = 1;
        while(tail.next!=null){
            tail = tail.next;
            l++;
        }
        if(k%l==0) return head;
        k = k%l;
        tail.next = head;
        ListNode LastNode = NthNode(head,l-k);
        head = LastNode.next;
        LastNode.next = null;
        return head;
    }
}
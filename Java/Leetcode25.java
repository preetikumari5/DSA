// reverse k nodes of LL at a time

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
    public ListNode reverseList(ListNode head){
        if(head==null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
    public ListNode kthNode(ListNode temp , int k){
        k = k-1;
        while(temp!=null && k>0){
            k--;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode k_node = kthNode(temp,k);
            if(k_node == null){
                if(prev!=null) 
                    prev.next = temp;
                break;
            }
            ListNode next = k_node.next;
            k_node.next = null;
            reverseList(temp);
            if(temp==head){
                head = k_node;
            }else {
                prev.next = k_node;
            }
            prev = temp;
            temp = next;
        }
        return head;
    }
}
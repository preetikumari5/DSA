// intersection of Y LL

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int length(ListNode head){
        ListNode temp = head;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n1 = length(headA);
        int n2 = length(headB);
        int d;
        if(n1>n2) d = n1-n2;
        else d = n2-n1;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        if(n1>n2){
            for(int i=0;i<d;i++) temp1 = temp1.next;
        }
        else {
            for(int i=0;i<d;i++) temp2 = temp2.next;
        }
        while(temp1!= null && temp2 !=null){
            if(temp1==temp2) return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
        
    }
}
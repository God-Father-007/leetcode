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
    public ListNode rotateRight(ListNode head, int k) {
        int l = getLength(head);
        if( l < 2 ) { return head; }
        k %= l;
        l -= k;
        if( k == 0 ) { return head; }
        ListNode dummy = new ListNode(0,head);
        ListNode temp = dummy ;
        while( temp != null && l > 0 ) { temp = temp.next; l--; }
        ListNode remaining = temp.next;
        temp.next = null;
        dummy.next = remaining;
        while( remaining.next != null ) { remaining = remaining.next; }
        remaining.next = head;
        return dummy.next;
    }

    private int getLength( ListNode head ) {
        ListNode temp = head;
        int ans = 0;
        while( temp != null ) { ans++; temp = temp.next; }
        return ans;
    }
}
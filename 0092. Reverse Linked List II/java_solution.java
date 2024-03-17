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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if( left == right ) { return head; }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode l = dummy, r = head;
        for( int i=1; i<left;i++ ) { l = l.next; }
        for( int i=1; i<right;i++ ) { r = r.next; }
        ListNode temp = l.next, remaining = r.next;
        l.next = null;
        r.next = null;
        ListNode rev = reverse( temp );
        l.next = rev;
        while( rev.next != null ) { rev = rev.next; }
        rev.next = remaining;
        return dummy.next;
    }

    private ListNode reverse(ListNode n) {
        ListNode prev = null, curr = n, next = n.next;
        while( curr != null ) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
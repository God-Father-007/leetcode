/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode f = cycleExists(head), s = head;
        while( f != null && s != f ) { s = s.next; f = f.next; }
        return f;
    }
    private ListNode cycleExists( ListNode head ) {
        if( head == null || head.next == null ) { return null; }
        ListNode s = head.next, f = head.next.next;
        while( f != null && f.next != null && s != f ) {
            s = s.next; f = f.next.next;
        }
        return s != f ? null : f ;
    }
}
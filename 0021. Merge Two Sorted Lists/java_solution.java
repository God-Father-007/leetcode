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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if( l1 == null && l2 == null ) { return null; }
        if( l1 == null ) { return l2; }
        else if( l2 == null ) { return l1; }
        
        ListNode prev = new ListNode(-1);
        ListNode p1 = l1; // pointer for list l1
        ListNode p2 = l2; // pointer for list l2
        
        ListNode newHead = prev;
        
        while( p1 != null && p2 != null ) {
            if(p1.val < p2.val) {
                prev.next = p1;
                p1 = p1.next;
            } else {
                prev.next = p2;
                p2 = p2.next;
            }
            prev = prev.next;
        }
        if( p1 == null ) { prev.next = p2; }
        else if( p2 == null ) { prev.next = p1; }
        
        return newHead.next;
        
    }
}
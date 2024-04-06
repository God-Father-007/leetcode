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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if( headA == null || headB == null ) { return null; }
        ListNode p1 = headA;
        while( p1 != null ) {
            ListNode p2 = headB;
            while( p2 != null ) {
                if( p1 == p2 ) { return p1; }
                p2 = p2.next;
            }
            p2 = headB;
            p1 = p1.next;
        }
        return null;
    }
}
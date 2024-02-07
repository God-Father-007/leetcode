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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode ans = new ListNode();
        ListNode a = ans;
        ListNode p = l1;
        ListNode q = l2;
        int carry = 0;
        while( p != null && q != null ) {
            int v = p.val+q.val+carry;
            a.val = v%10;
            carry = v/10;
            p = p.next;
            q = q.next;
            a.next = new ListNode();
            a = a.next;
        }
        while( p != null ) {
            int v = p.val+carry;
            a.val = v%10;
            carry = v/10;
            p = p.next;
            a.next = new ListNode();
            a = a.next;
        }
        while( q != null ) {
            int v = q.val+carry;
            a.val = v%10;
            carry = v/10;
            q = q.next;
            a.next = new ListNode();
            a = a.next;
        }
        if( carry == 0 ) {
            a = ans;
            while( a.next.next != null ) { a = a.next; }
            a.next = null;
        } else { a.val = carry; }
        return ans;
    }
}
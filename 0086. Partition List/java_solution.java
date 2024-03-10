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
    public ListNode partition(ListNode head, int x) {
        ListNode l = new ListNode(), r = new ListNode();
        ListNode temp = head, a = l, b = r;
        while( temp != null ) {
            if( temp.val < x ) {
                a.next = temp;
                temp = temp.next;
                a = a.next;
                a.next = null;
            } else {
                b.next = temp;
                temp = temp.next;
                b = b.next;
                b.next = null;
            }
        }
        a.next = r.next;
        return l.next;
    }
}
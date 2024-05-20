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
    public ListNode oddEvenList(ListNode head) {
        boolean odd = true;
        ListNode o = new ListNode(), e = new ListNode(), curr = head, i = o, j = e;
        while( curr != null ) {
            if( odd ) {
                i.next = curr;
                curr = curr.next;
                i = i.next;
                i.next = null;
            } else {
                j.next = curr;
                curr = curr.next;
                j = j.next;
                j.next = null;
            }
            odd ^= true;
        }
        i.next = e.next;
        return o.next;
    }
}
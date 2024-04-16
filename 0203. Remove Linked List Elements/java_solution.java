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
    public ListNode removeElements(ListNode head, int val) {
        if( head == null ) { return null; }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy, curr = head;
        while( curr != null ) {
            ListNode next = curr.next;
            if( curr.val == val ) {
                pre.next = next;
            } else { pre = curr; }
            curr = next;
        }
        return dummy.next;
    }
}
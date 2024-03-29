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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy, curr = head;
        while( curr != null && curr.next != null ) {
            pre.next = curr.next;
            curr.next = curr.next.next;
            pre.next.next = curr;
            pre = curr;
            curr = curr.next;
        }
        return dummy.next;
    }
}
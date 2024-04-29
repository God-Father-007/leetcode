/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode curr = node, pre = null;
        while( curr.next != null ) {
            curr.val = curr.next.val;
            pre = curr;
            curr = curr.next;
        }
        pre.next = null;
    }
}
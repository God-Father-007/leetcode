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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        int l = getLength(head);
        l = l - n;
        ListNode temp = dummy;
        while( l > 0 ) { temp = temp.next; l--; }
        temp.next = temp.next.next;
        return dummy.next;
    }

    private int getLength( ListNode head ) {
        ListNode temp = head;
        int ans = 0;
        while( temp != null ) { ans++; temp = temp.next; }
        return ans;
    }
}
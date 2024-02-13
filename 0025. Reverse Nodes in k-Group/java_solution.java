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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0,head), temp = head, prev = dummy;
        while( temp != null ) {
            int l = 1;
            ListNode n = temp;
            while( l < k && n.next != null ) {
                l++; n = n.next;
            }
            if( l < k ) { break; }
            prev.next = null;
            ListNode remaining = n.next;
            n.next = null;
            reverse(temp);
            prev.next = n;
            temp.next = remaining;
            prev = temp;
            temp = remaining;
        }
        return dummy.next;
    }

    private void reverse( ListNode head ) {
        ListNode prev = null, curr = head, forw = null;
        while(curr!=null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
    }
}
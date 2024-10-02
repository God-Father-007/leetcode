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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        int l = len( head ), extra = l % k;
        for( int i = 0; i < k; i++ ) {
            ans[i] = head;
            ListNode n = ans[i];
            for( int j = extra > 0 ? 0 : 1; n != null && j < l/k ; j++ ) {
                n = n.next;
            }
            if( n == null ) { break; }
            head = n.next;
            n.next = null;
            extra -= extra == 0 ? 0 : 1;
        }
        return ans;
    }

    private int len( ListNode head ) {
        int len = 0;
        while( head != null ) { head = head.next; len++; }
        return len;
    }
}
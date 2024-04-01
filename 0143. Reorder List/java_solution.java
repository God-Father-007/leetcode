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
    public void reorderList(ListNode head) {
        ListNode mid = getMid( head ), rev = reverse( mid.next );
        mid.next = null;
        mid = head;
        ListNode dummy = new ListNode(), ans = dummy;
        while( mid != null ) {
            ListNode temp = mid;
            mid = mid.next;
            temp.next = null;
            ans.next = temp;
            ans = ans.next;
            if( rev != null ) {
                temp = rev;
                rev = rev.next;
                temp.next = null;
                ans.next = temp;
                ans = ans.next;
            }
        }
    }

    private ListNode getMid( ListNode head ) {
        ListNode s = head, f = head;
        while( f.next != null && f.next.next != null ) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    private ListNode reverse( ListNode head ) {
        ListNode pre = null, cur = head;
        while( cur != null ) {
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
}
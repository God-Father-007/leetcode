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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        ListNode pre = dummy, temp = head;
        int l = 0;
        while( temp != null ) {
            if( pre.next.val == temp.val ) { temp = temp.next; l++; continue; }
            if( l == 1 ) { pre = pre.next; }
            else { pre.next = temp; }
            l = 0;
        }
        if( l > 1 ) { pre.next = temp; }
        return dummy.next;
    }
}
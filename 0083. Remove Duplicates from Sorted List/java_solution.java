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
        if( head == null || head.next == null ) { return head; }
        ListNode start = head;
        while( start != null ){
            ListNode temp = start;
            while( temp.next != null && temp.val == temp.next.val ) {
                temp = temp.next;
            }
            start.next = temp.next;
            start = start.next;
        }
        return head;
    }
}
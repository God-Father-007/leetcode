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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q = new PriorityQueue<>( (a,b) -> a.val - b.val );
        for( ListNode l : lists ) {
            if( l != null ) { q.add(l); }
        }
        ListNode ans = new ListNode(), ap = ans;
        while( q.size() > 0 ) {
            ListNode n = q.poll(), next = n.next;
            n.next = null;
            ap.next = n;
            ap = ap.next;
            if( next != null ) { q.add( next ); }
        }
        return ans.next;
    }
}
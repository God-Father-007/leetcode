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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> s = new HashSet<>();
        for( int n : nums ) { s.add( n ); }
        int l = 0, last = 0, ans = 0;
        while( head != null ) {
            if( s.contains( head.val ) ) { l++; }
            else {
                ans += l != 0 ? 1 : 0;
                l = 0;
            }
            last = head.val;
            head = head.next;
        }
        return ans + (s.contains( last ) ? 1 : 0);
    }
}
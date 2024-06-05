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
    ListNode head;
    int size;

    public Solution(ListNode head) {
        this.head = head;
        this.size = size(head);
    }
    
    public int getRandom() {
        int x = (int)Math.floor(size*Math.random());
        ListNode t = head;
        for( ; x > 0; x-- ) { t = t.next; }
        return t.val;
    }

    private int size(ListNode head) {
        int s = 0;
        while( head != null ) { s++; head = head.next; }
        return s;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
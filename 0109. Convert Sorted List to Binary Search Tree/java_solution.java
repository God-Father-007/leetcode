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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if( head == null ) { return null; }
        if( head.next == null ) { return new TreeNode(head.val); }
        ListNode preMid = getPreMid(head);
        ListNode mid = preMid.next, remaining = mid.next;
        preMid.next = null; mid.next = null;
        return new TreeNode( mid.val, sortedListToBST( head ), sortedListToBST( remaining ) );
    }

    private ListNode getPreMid(ListNode head) {
        ListNode s = head, f = head, pre = null;
        while( f != null && f.next != null ) {
            f = f.next.next;
            pre = s;
            s = s.next;
        }
        return pre;
    }
}
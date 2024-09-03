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
    
    public boolean findTarget(TreeNode root, int k) {
        Stack<TreeNode> ls = new Stack<>();
        Stack<TreeNode> rs = new Stack<>();
        for( TreeNode i = root; i != null; i = i.left ) { ls.push(i); }
        for( TreeNode i = root; i != null; i = i.right ) { rs.push(i); }
        while( ls.size() > 0 && rs.size() > 0 ) {
            TreeNode a = ls.peek(), b = rs.peek();
            if( a == b ) { return false; }
            if( a.val+b.val == k ) { return true; }
            if( a.val+b.val > k ) {
                b = rs.pop().left;
                while( b != null ) { rs.push(b); b = b.right; }
            } else {
                a = ls.pop().right;
                while( a != null ) { ls.push(a); a = a.left; }
            }
        }
        return false;
    }
}
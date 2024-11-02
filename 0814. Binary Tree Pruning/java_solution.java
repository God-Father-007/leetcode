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
    public TreeNode pruneTree(TreeNode root) {
        return helper( root ) == 0 ? null : root ;
    }

    private int helper( TreeNode root ) {
        if( root == null ) { return 0; }
        int l = helper( root.left );
        int r = helper( root.right );
        if( l == 0 ) { root.left = null; }
        if( r == 0 ) { root.right = null; }
        return l + r + root.val;
    }
}
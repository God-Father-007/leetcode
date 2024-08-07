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
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 0;
        int h = helper( root );
        return ans;
    }

    private int helper( TreeNode root ) {
        if( root == null ) { return -1; }
        int l = helper( root.left );
        int r = helper( root.right );
        ans = Math.max( ans, l+r+2 );
        return 1 + Math.max( l, r );
    }

}
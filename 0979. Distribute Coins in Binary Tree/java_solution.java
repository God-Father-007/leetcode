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
    public int distributeCoins(TreeNode root) {
        ans = 0;
        helper(root);
        return ans;
    }

    private int helper( TreeNode root ) {
        if( root == null ) { return 0; }
        int l = helper(root.left), r = helper(root.right);
        ans += Math.abs(l) + Math.abs(r);
        int req = 1 + l + r;
        return req - root.val;
    }
}
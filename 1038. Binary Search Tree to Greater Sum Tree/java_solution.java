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
    public TreeNode bstToGst(TreeNode root) {
        int x = helper( root, 0 );
        return root;
    }

    private int helper( TreeNode root, int sum ) {
        if( root == null ) { return sum; }
        int r = helper( root.right, sum );
        root.val = r + root.val;
        int l = helper( root.left, root.val );
        return Math.max( root.val, l );
    }
}
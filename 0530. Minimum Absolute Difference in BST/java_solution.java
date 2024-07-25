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
    public int getMinimumDifference(TreeNode root) {
        ans = Integer.MAX_VALUE;
        int[] x = helper( root );
        return ans;
    }
    private int[] helper( TreeNode root ) {
        int[] x = new int[]{ root.val, root.val };
        if( root.left != null ) {
            int[] l = helper( root.left );
            ans = Math.min( ans, Math.abs(root.val - l[1]) );
            x[0] = Math.min(l[0],x[0]);
        }
        if( root.right != null ) {
            int[] r = helper( root.right );
            ans = Math.min( ans, Math.abs(root.val - r[0]) );
            x[1] = Math.max(r[1],x[1]);
        }
        return x;
    }
}
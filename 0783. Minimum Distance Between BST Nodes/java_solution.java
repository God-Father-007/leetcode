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
    
    private int min( TreeNode root ) {
        if( root.left == null ) { return root.val; }
        return min(root.left);
    }
    
    private int max(TreeNode root) {
        if( root.right == null ) { return root.val; }
        return max(root.right);
    }
    
    public int minDiffInBST(TreeNode root) {
        if( root.left == null && root.right == null ) { return Integer.MAX_VALUE; }
        else if( root.left == null ) {
            return Math.min( min(root.right) - root.val, minDiffInBST(root.right) );
        } else if( root.right == null ) {
            return Math.min( root.val - max(root.left), minDiffInBST(root.left) );
        } else {
            int ans = Math.min( min(root.right) - root.val, root.val - max(root.left) );
            return Math.min( ans, Math.min( minDiffInBST(root.left), minDiffInBST(root.right) ) );
        }
    }
}
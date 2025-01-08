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
    Integer ans;
    
    private void helper( TreeNode root, String s ) {
        if( root.left == null && root.right == null ) {
            ans += Integer.parseInt( s+root.val, 2 );
            return;
        }
        if( root.left != null ) { helper( root.left, s+root.val ); }
        if( root.right != null ) { helper( root.right, s+root.val ); }
    }
    
    public int sumRootToLeaf(TreeNode root) {
        ans = 0;
        helper( root, "" );
        return ans;
    }
}
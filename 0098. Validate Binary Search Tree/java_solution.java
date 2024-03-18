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

    int a = Integer.MIN_VALUE, b = Integer.MIN_VALUE, n = 0;
    boolean ans = true;

    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        return ans;
    }

    private void inOrder(TreeNode root) {
        if( root == null ) { return; }
        inOrder( root.left );
        a = b;
        b = root.val;
        n++;
        if( n > 1 ) {
            ans &= a < b;
        }
        if( !ans ) { return; }
        inOrder( root.right );
    }

}
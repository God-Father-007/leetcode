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
    public boolean isUnivalTree(TreeNode root) {
        boolean ans = true;
        if( root.left != null ) {
            if( root.val == root.left.val ) { ans &= isUnivalTree(root.left); }
            else { ans =  false; }
        }
        if( root.right != null ) {
            if( root.val == root.right.val ) { ans &= isUnivalTree(root.right); }
            else { ans = false; }
        }
        return ans;
    }
}
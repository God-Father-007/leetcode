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
    public String tree2str(TreeNode root) {
        if( root == null ) { return ""; }
        String l = tree2str(root.left), r = tree2str(root.right);
        if( r.length() > 0 ) {
            r = "(" + r + ")";
            l = "(" + l + ")";
        } else if( l.length() > 0 ) { l = "(" + l + ")"; }
        return root.val + l + r;
    }
}
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
    
    public int height(TreeNode root) {
        if(root == null) { return 0; }
        return Math.max( height(root.left), height(root.right) ) + 1;
    }
    
    public boolean isBalanced(TreeNode root) {
        if( root == null ) { return true; }
        boolean flag = true;
        if( Math.abs(height(root.left) - height(root.right)) > 1 ) { flag = false; }
        return flag && isBalanced(root.left) && isBalanced(root.right);
    }
}
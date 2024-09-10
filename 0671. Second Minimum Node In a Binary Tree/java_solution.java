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
    
    Integer abs_min;
    
    public int helper( TreeNode root ) {
        if( root == null ) { return -1; }
        if( root.left == null && root.right == null ) {
            if( root.val == abs_min ) { return -1; }
            else { return root.val; }
        }
        int left = helper(root.left);
        int right = helper(root.right);
        
        if( left < 0 && right < 0 ) { return -1; }
        else if( left < 0 ) { return right; }
        else if( right < 0 ) { return left; }
        else { return Math.min( left, right ); }
    }
    
    public int findSecondMinimumValue(TreeNode root) {
        abs_min = root.val;
        return helper(root);
    }
}
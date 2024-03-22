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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode();
        if( nums.length == 0 ) { root = null; return root; }
        int m = nums.length / 2;
        root.val = nums[m];
        if( nums.length == 1 ) {
            root.left = null;
            root.right = null;
            return root;
        }
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,m));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums,m+1,nums.length));
        return root;
    }
}
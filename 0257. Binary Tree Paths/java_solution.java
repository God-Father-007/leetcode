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
    List<String> ans;
    public void sol(TreeNode root, String psf) {
        if( root == null ) { return; }
        if( root.left == null && root.right == null ) { ans.add( psf+root.val ); }
        sol( root.left, psf+root.val+"->" );
        sol( root.right, psf+root.val+"->" );
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        ans = new ArrayList<>();
        sol( root, "" );
        return ans;
    }
}
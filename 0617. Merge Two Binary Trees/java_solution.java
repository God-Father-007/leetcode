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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if( t1 == null && t2 == null ) { return null; }
        TreeNode ans = new TreeNode();
        if( t1 == null ) {
            ans = t2;
            return ans;
        }
        if( t2 == null ) {
            ans = t1;
            return ans;
        }
        ans.val = t1.val+t2.val;
        ans.left = mergeTrees( t1.left, t2.left );
        ans.right = mergeTrees( t1.right, t2.right );
        return ans;
    }
}
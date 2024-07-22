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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        int ans = 0;
        q.add( root );
        while( q.size() > 0 ) {
            ans = q.peek().val;
            int l = q.size();
            while( l > 0 ) {
                TreeNode node = q.remove();
                if( node.left != null ) { q.add( node.left ); }
                if( node.right != null ) { q.add( node.right ); }
                l--;
            }
        }
        return ans;
    }
}
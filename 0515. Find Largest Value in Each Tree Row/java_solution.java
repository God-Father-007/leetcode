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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        if( root != null ) { q.add( root ); }
        while( !q.isEmpty() ) {
            int size = q.size(), max = Integer.MIN_VALUE;
            while( size > 0 ) {
                TreeNode n = q.remove();
                max = Math.max( max, n.val );
                if( n.left != null ) { q.add( n.left ); }
                if( n.right != null ) { q.add( n.right ); }
                size--;
            }
            ans.add( max );
        }
        return ans;
    }
}
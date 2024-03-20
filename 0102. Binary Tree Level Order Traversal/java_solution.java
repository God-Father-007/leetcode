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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if( root == null ) { return ans; }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add( root );
        while( q.size() > 0 ) {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            while( size > 0 ) {
                TreeNode x = q.remove();
                temp.add(x.val);
                if( x.left != null ) { q.add( x.left ); }
                if( x.right != null ) { q.add( x.right ); }
                size--;
            }
            ans.add( temp );
        }
        return ans;
    }
}
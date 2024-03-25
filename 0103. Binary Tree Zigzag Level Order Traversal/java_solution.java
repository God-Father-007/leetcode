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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if( root == null ) { return ans; }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add( root );
        for( int level = 1; q.size() > 0; level++ ) {
            List<Integer> temp = new ArrayList<>();
            for( int i = q.size(); i > 0; i-- ) {
                TreeNode n = q.remove();
                if( n.left != null ) { q.add( n.left ); }
                if( n.right != null ) { q.add( n.right ); }
                temp.add( n.val );
            }
            if( level % 2 == 0 ) { Collections.reverse(temp); }
            ans.add( temp );
        }
        return ans;
    }
}
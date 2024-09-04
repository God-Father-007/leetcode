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
    public List<List<String>> printTree(TreeNode root) {
        int h = height( root ), start = (int)Math.pow(2,h) - 1;
        List<List<String>> ans = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        for( int i = 0; i < h; i++ ) {
            List<String> row = new ArrayList<>();
            int idx = start / 2, inc = (int)Math.pow(2,h-i);
            for( int j = 1; j < Math.pow(2,h); j++ ) {
                if( j-1 == idx ) {
                    TreeNode n = q.remove();
                    row.add( n.val == 100 ? "" : (n.val+"") );
                    q.add( n.left == null ? new TreeNode(100) : n.left );
                    q.add( n.right == null ? new TreeNode(100) : n.right );
                    idx += inc;
                }
                else { row.add( "" ); }
            }
            start /= 2;
            ans.add( row );
        }
        return ans;
    }

    private int height( TreeNode root ) {
        if( root == null ) { return 0; }
        return 1 + Math.max( height( root.left ), height( root.right ) );
    }
}
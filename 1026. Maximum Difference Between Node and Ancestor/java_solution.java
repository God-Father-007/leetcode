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
    public int maxAncestorDiff(TreeNode root) {
        return helper( root, new ArrayList<>() );
    }

    private int helper( TreeNode root, List<Integer> ancestors ) {
        if( root == null ) { return 0; }
        int ans = 0;
        for( int a : ancestors ) {
            ans = Math.max( ans, Math.abs(a - root.val) );
        }
        ancestors.add( root.val );
        ans = Math.max( ans, helper( root.left, ancestors ) );
        ans = Math.max( ans, helper( root.right, ancestors ) );
        ancestors.remove( ancestors.size() - 1 );
        return ans;
    }
}
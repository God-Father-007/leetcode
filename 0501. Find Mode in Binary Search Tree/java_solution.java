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
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> m = new HashMap<>();
        helper( root, m );
        int f = Collections.max( m.values() ), l = 0;
        for( int i : m.keySet() ) {
            if( m.get(i) == f ) { l++; }
        }
        int[] ans = new int[l];
        for( int i : m.keySet() ) {
            if( m.get(i) == f ) { ans[--l] = i; }
        }
        return ans;
    }

    private void helper( TreeNode root, Map<Integer,Integer> m ) {
        if( root == null ) { return; }
        m.put( root.val, m.getOrDefault( root.val, 0 ) + 1 );
        helper( root.left, m );
        helper( root.right, m );
    }
}
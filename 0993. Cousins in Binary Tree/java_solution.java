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
    
    private int depth( TreeNode root, int x, int d ) {
        if( root == null ) { return 0; }
        if( root.val == x ) { return d; }
        return Math.max( depth(root.left, x, 1+d), depth(root.right, x, 1+d) );
    }
    
    private TreeNode parent( TreeNode root, int x ) {
        TreeNode l = null, r = null;
        if( root.left != null ) {
            if( root.left.val == x ) { return root; }
            l = parent( root.left, x );
        }
        if( root.right != null ) {
            if( root.right.val == x ) { return root; }
            r = parent( root.right, x );
        }
        if( l == null && r == null ) { return null; }
        if( l == null ) { return r; }
        else { return l; }
    }
    
    public boolean isCousins(TreeNode root, int x, int y) {
        // boolean a = parent(root,x) == parent(root,y);
        // System.out.println( a  );
        // return true;
        return depth(root,x,0) == depth(root,y,0) && parent(root,x) != parent(root,y);
    }
}
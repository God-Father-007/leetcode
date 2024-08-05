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
    
    public int[] sol( TreeNode n ) {
        int[] x = new int[2];
        if( n == null ) {
            x[0] = 0; x[1] = 0;
            return x;
        }
        if( n.left == null && n.right == null ) {
            x[0] = n.val; x[1] = 0;
            return x;
        }
        int[] l = sol( n.left );
        int[] r = sol( n.right );
        x[1] = l[1]+r[1]+Math.abs( l[0]-r[0] );
        x[0] = l[0]+r[0]+n.val;
        return x;
    }
    
    public int findTilt(TreeNode root) {
        int[] a = sol(root);
        return a[1];
    }
}
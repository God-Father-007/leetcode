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
    public TreeNode increasingBST(TreeNode root) {
        if( root == null ) { return null; }
        if( root.left == null && root.right == null ) { return root; }
        else if( root.left != null && root.right !=null ) {
            TreeNode l = increasingBST(root.left);
            root.left = null;
            TreeNode temp = l;
            while( temp.right != null ) { temp = temp.right; }
            temp.right = root;
            root.right = increasingBST(root.right);
            return l;
        }
        else if( root.right != null ) {
            root.right = increasingBST(root.right);
            return root;
        }
        else {
            TreeNode l = increasingBST(root.left);
            root.left = null;
            TreeNode temp = l;
            while( temp.right != null ) { temp = temp.right; }
            temp.right = root;
            return l;
        }
    }
}
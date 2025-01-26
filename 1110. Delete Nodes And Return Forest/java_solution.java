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
    List<TreeNode> ans;
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        ans = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        for( int n : to_delete ) { s.add(n); }
        if( !s.contains(root.val) ) { ans.add(root); }
        root = helper( root, s );
        return ans;
    }

    private TreeNode helper( TreeNode root, Set<Integer> toDel ) {
        if( root == null ) { return null; }
        root.left = helper( root.left, toDel );
        root.right = helper( root.right, toDel );
        if( toDel.contains(root.val) ) {
            if( root.left != null ) { ans.add( root.left ); }
            if( root.right != null ) { ans.add( root.right ); }
            return null;
        }
        return root;
    }
}
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = getLeafSeq( root1 );
        List<Integer> l2 = getLeafSeq( root2 );
        for( int i = 0; i < l1.size(); i++ ) {
            if( i == l2.size() || l1.get(i) != l2.get(i) ) { return false; }
        }
        return l1.size() == l2.size();
    }

    private List<Integer> getLeafSeq( TreeNode root ) {
        List<Integer> l = new ArrayList<>();
        if( root == null ) { return l; }
        if( root.left == null && root.right == null ) {
            l.add( root.val );
            return l;
        }
        l.addAll( getLeafSeq( root.left ) );
        l.addAll( getLeafSeq( root.right ) );
        return l;
    }
}
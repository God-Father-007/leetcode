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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        List<Double> ans = new ArrayList<>();
        q.add( root );
        int i=1;
        while( q.size() > 0 ) {
            int j=0, t = i;
            double avg = 0.00;
            while( i>0 ) {
                TreeNode n = q.remove();
                avg += (double)n.val;
                if( n.left != null ) { j++; q.add( n.left ); }
                if( n.right != null ) { j++; q.add( n.right ); }
                i--;
            }
            ans.add( avg/t );
            i = j;
        }
        return ans;
    }
}
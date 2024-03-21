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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) { return ans; }
        Queue<TreeNode> s = new ArrayDeque<>();
        s.add(root);
        int x = 1;
        while(s.size() > 0) {
            List<Integer> temp = new ArrayList<>();
            while(x>0) {
                TreeNode n = s.remove();
                temp.add(n.val);
                if(n.left != null) { s.add(n.left); }
                if(n.right != null) { s.add(n.right); }
                x--;
            }
            x = s.size();
            ans.add(temp);
        }
        Collections.reverse(ans);
        return ans;
    }
}
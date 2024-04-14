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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(q.size()>0)
        {
            int size = q.size();
            ans.add(q.peek().val);
            while(size>0)
            {
                TreeNode rn = q.remove();
                if(rn.right!=null)
                q.add(rn.right);
                if(rn.left!=null)
                q.add(rn.left);
                size--;
            }
        }
        return ans;
    }
}
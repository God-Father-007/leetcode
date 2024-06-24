/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> q = new ArrayDeque<>();
        if( root != null ) { q.add(root); }
        List<List<Integer>> ans = new ArrayList<>();
        while( q.size() > 0 ) {
            int s = q.size();
            List<Integer> temp = new ArrayList<>();
            while( s > 0 ) {
                Node x = q.remove();
                temp.add( x.val );
                for( Node n : x.children ) { q.add(n); }
                s--;
            }
            ans.add(temp);
        }
        return ans;
    }
}
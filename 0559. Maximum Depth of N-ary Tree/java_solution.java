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
    public int maxDepth(Node root) {
        int max = Integer.MIN_VALUE;
        if( root == null ) { return 0; }
        for( Node n : root.children ) {
            max = Math.max( max,maxDepth(n) );
        }
        if( max == Integer.MIN_VALUE ) { max = 0; }
        return max+1;
    }
}
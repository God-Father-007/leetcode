/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    StringBuilder s;
    public String serialize(TreeNode root) {
        s = new StringBuilder();
        helper( root );
        s.deleteCharAt( s.length()-1 );
        return s.toString();
    }

    private void helper(TreeNode root) {
        if( root == null ) { s.append("1001,"); return; }
        s.append( root.val + "," );
        helper( root.left );
        helper( root.right );
    }

    // Decodes your encoded data to tree.
    class Pair{
        TreeNode node;
        int status;
        Pair(TreeNode node, int status) {
            this.node = node; this.status = status;
        }
    }
    public TreeNode deserialize(String data) {
        String[] vals = data.split(",");
        Stack<Pair> s = new Stack<>();
        for( String val : vals ) {
            int v = Integer.parseInt(val);
            TreeNode n = v == 1001 ? null : new TreeNode(v) ;
            if( s.size() > 0 ) {
                TreeNode x = s.peek().node;
                s.peek().status++;
                if( s.peek().status == 2 ) { x.right = n; }
                else if( s.peek().status == 1 ) { x.left = n; }
            }
            if( n != null ) { s.push( new Pair( n, 0 ) ); }
            while( s.size() > 1 && s.peek().status == 2 ) { s.pop(); }
        }
        return s.size() == 0 ? null : s.pop().node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
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
        return s.toString();
    }
    private int helper( TreeNode root ) {
        if( root == null ) { return 0; }
        // s.append( root.val );
        int len = s.length();
        int l = helper( root.left );
        s.insert( len, root.val + "-" + l + " " );
        return l + helper( root.right ) + 1;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] s = data.split( " " );
        return helper( s, 0, s.length-1 );
    }
    private TreeNode helper( String[] s, int l, int r ) {
        if( l > r || s[l].equals("") ) { return null; }
        String[] x = s[l].split("-");
        TreeNode n = new TreeNode( Integer.parseInt(x[0]) );
        int size = Integer.parseInt( x[1] );
        n.left = helper( s, l+1, l + size );
        n.right = helper( s, l + size + 1, r );
        return n;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
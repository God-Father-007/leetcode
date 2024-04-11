class BSTIterator {
    Stack<TreeNode> s;
    public BSTIterator(TreeNode root) {
        this.s = new Stack<>();
        while( root != null ) { s.push(root); root = root.left; }
    }
    
    public int next() {
        TreeNode next = s.pop(), n = next.right;
        while( n != null ) { s.push(n); n = n.left; }
        return next.val;
    }
    
    public boolean hasNext() {
        return s.size() > 0;
    }
}
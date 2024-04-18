class Trie {
    class Node{
        char c;
        Node[] children;
        boolean inserted;
        Node( char c ) {
            this.c = c;
            this.children = new Node[26];
            this.inserted = false;
        }
    }

    Node root;

    public Trie() {
        this.root = new Node('0');
    }
    
    public void insert(String word) {
        insertHelper( word.toCharArray(), 0, root );
    }
    private void insertHelper( char[] c, int i, Node root ) {
        if( i == c.length ) { root.inserted = true; return; }
        if( root.children[ c[i]-'a' ] == null ) {
            root.children[ c[i]-'a' ] = new Node(c[i]);
        }
        insertHelper( c, i+1, root.children[ c[i]-'a' ] );
    }
    
    public boolean search(String word) {
        return searchHelper( word.toCharArray(), 0, root, true );
    }
    public boolean startsWith(String prefix) {
        return searchHelper( prefix.toCharArray(), 0, root, false );
    }

    private boolean searchHelper( char[] c, int i, Node root, boolean strict ) {
        if( i == c.length ) { return !strict || root.inserted; }
        if( root.children[ c[i]-'a' ] == null ) { return false; }
        return searchHelper( c, i+1, root.children[ c[i]-'a' ], strict );
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
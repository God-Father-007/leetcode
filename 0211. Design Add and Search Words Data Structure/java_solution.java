class WordDictionary {

    class Node{
        char c;
        Node[] children;
        boolean terminal;
        Node(char c) {
            this.c = c;
            this.children = new Node[26];
            this.terminal = false;
        }
    }

    Node root;

    public WordDictionary() {
        this.root = new Node('0');
    }
    
    public void addWord(String word) {
        addHelper( word.toCharArray(), 0, root );
    }
    private void addHelper( char[] c, int i, Node root ) {
        if( i == c.length ) { root.terminal = true; return; }
        if( root.children[ c[i]-'a' ] == null ) {
            root.children[ c[i]-'a' ] = new Node( c[i] );
        }
        addHelper( c, i+1, root.children[ c[i]-'a' ] );
    }
    
    public boolean search(String word) {
        return searchHelper( word.toCharArray(), 0, root );
    }
    private boolean searchHelper( char[] c, int i, Node root ) {
        if( i == c.length ) { return root.terminal; }
        if( c[i] != '.' ) {
            if( root.children[ c[i]-'a' ] == null ) {return false;}
            return searchHelper( c, i+1, root.children[ c[i]-'a' ] );
        }
        for( Node n : root.children ) {
            if( n == null ) { continue; }
            if( searchHelper( c, i+1, n ) ) { return true; }
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
class Solution {
    class Trie {
        class Node{
            char c;
            Node[] children;
            boolean terminal;
            Node( char c ) {
                this.c = c;
                this.children = new Node[26];
                this.terminal = false;
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
            if( i == c.length ) { root.terminal = true; return; }
            if( root.children[ c[i]-'a' ] == null ) {
                root.children[ c[i]-'a' ] = new Node(c[i]);
            }
            insertHelper( c, i+1, root.children[ c[i]-'a' ] );
        }
        
        public int shortestPrefix(String word) {
            return shortestPrefix( word.toCharArray(), 0, root );
        }
        private int shortestPrefix( char[] c, int i, Node root ) {
            if( root.terminal ) { return i; }
            if( i == c.length || root.children[ c[i]-'a' ] == null ) {
                return c.length;
            }
            return shortestPrefix( c, i+1, root.children[ c[i]-'a' ] );
        }
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        Trie trie = new Trie();
        for( String word : dictionary ) { trie.insert(word); }
        String[] words = sentence.split( " " );
        for( int i = 0; i < words.length; i++ ) {
            int idx = trie.shortestPrefix( words[i] );
            words[i] = words[i].substring( 0, idx );
        }
        return String.join( " ", words );
    }
}
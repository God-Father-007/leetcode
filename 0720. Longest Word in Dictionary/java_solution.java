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

        public String searchLongestWord( Node n, String ssf ) {
            String ans = ssf;
            for( int i = 25; i >= 0; i-- ) {
                Node child = n.children[i];
                if( child == null || !child.terminal ) { continue; }
                String temp = searchLongestWord( child, ssf + (char)(i+'a') );
                if( temp.length() >= ans.length() ) {
                    ans = temp;
                }
            }
            return ans;
        }
    }
    public String longestWord(String[] words) {
        Trie trie = new Trie();
        for( String word : words ) {
            trie.insert( word );
        }
        return trie.searchLongestWord(trie.root,"");
    }
}
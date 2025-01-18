class Solution {
    class Pair{
        String first;
        int len;
        Pair(String first,  int len) {
            this.first = first;
            this.len = len;
        }
    }

    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a,b) -> a.length() > b.length() ? 1 : (a.length() < b.length() ? -1 : 0));
        List<Pair> l = solve( words, 0 );
        int ans = 0;
        for( Pair p : l ) {
            ans = Math.max(ans,p.len);
        }
        return ans;
    }
    private List<Pair> solve(String[] words, int i) {
        if( i == words.length ) { return new ArrayList<>(); }
        List<Pair> l = solve( words, i+1 );
        int n = l.size(), size = 1;
        for( Pair p : l ) {
            boolean m = match( p.first, words[i] );
            if( m ) { size = Math.max( size, p.len+1 ); }
        }
        l.add( new Pair(words[i],size) );
        return l;
    }

    private boolean match(String a, String b) {
        if( a.length() - b.length() != 1 ) { return false; }
        StringBuilder s = new StringBuilder(b);
        for( int i=0; i<=s.length(); i++ ) {
            s.insert(i,".");
            boolean x = a.matches( s.toString() );
            if( x ) { return true; }
            s.deleteCharAt(i);
        }
        return false;
    }
}
class Solution {
    
    static List<List<String>> ans;
    private void helper( int r, int n, int cs, int d1s, int d2s, List<String> a ) {
        // d1 -> /
        // d2 -> \
        if( r == n ) {
            List<String> x = new ArrayList<String>(a);
            ans.add( x );
            return;
        }
        StringBuilder s = new StringBuilder( ".".repeat(n) );
        for( int j=0;j<n;j++ ) {
            if( ( cs & (1<<j) ) > 0 || ( d1s & ( 1<<(r+j) ) ) > 0 || ( d2s & ( 1<<(n-1+r-j) ) ) > 0 ) { continue; }
            cs = cs ^ (1<<j);
            d1s = d1s ^ ( 1<<(r+j) );
            d2s = d2s ^ ( 1<<(n-1+r-j) );
            s.setCharAt( j ,'Q' );
            a.add( s.toString() );
            helper( r+1, n, cs, d1s, d2s, a );
            a.remove( a.size()-1 );
            s.setCharAt( j, '.' );
            cs = cs ^ (1<<j);
            d1s = d1s ^ ( 1<<(r+j) );
            d2s = d2s ^ ( 1<<(n-1+r-j) );
        }
    }
    
    public List<List<String>> solveNQueens(int n) {
        ans = new ArrayList<>();
        helper( 0, n, 0, 0, 0, new ArrayList<>() );
        return ans;
    }
}
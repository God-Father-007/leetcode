class Solution {
    public String getHint(String secret, String guess) {
        char[] s = secret.toCharArray();
        char[] g = guess.toCharArray();
        int[] d = new int[10];
        for( int i = 0; i < s.length; i++ ) {
            if( s[i] == g[i] ) { g[i] = '-'; continue; }
            d[ s[i]-'0' ]++;
        }
        int match = 0, exists = 0;
        for( int i = 0; i < g.length; i++ ) {
            if( g[i] == '-' ) { match++; continue; }
            if( d[ g[i]-'0' ] > 0 ) {
                d[ g[i]-'0' ]--; exists++;
            }
        }
        return match+"A"+exists+"B";
    }
}
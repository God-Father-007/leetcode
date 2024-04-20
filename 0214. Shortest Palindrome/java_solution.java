class Solution {
    public String shortestPalindrome(String s) {
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for( int j = c.length-1; j >= 0; j-- ) {
            if( c[0] == c[j] && pal( c, 1, j-1 ) ) { break; }
            sb.append( c[j]+"" );
        }
        return sb.toString() + s;
    }
    private boolean pal( char[] c, int l, int r ) {
        while( l < r ) {
            if( c[l] != c[r] ) { return false; }
            l++; r--;
        }
        return true;
    }
}
class Solution {
    public boolean validPalindrome(String s) {
        char[] c = s.toCharArray();
        int l = 0, r = c.length - 1;
        while( l < r ) {
            if( c[l] == c[r] ) { l++; r--; continue; }
            return pal( c, l, r-1 ) || pal( c, l+1, r ) ;
        }
        return true;
    }

    private boolean pal( char[] c, int l, int r ) {
        while( l < r ) {
            if( c[l] != c[r] ) { return false; }
            l++; r--;
        }
        return true;
    }
}
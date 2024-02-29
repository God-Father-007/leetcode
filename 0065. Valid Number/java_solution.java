class Solution {
    public boolean isNumber(String s) {
        char[] c = s.toCharArray();
        int i = 0;
        for( ; i < c.length; i++ ) {
            if( c[i] == 'e' || c[i] == 'E' ) { break; }
        }
        if( i == 0 || i == c.length-1 ) { return false; }
        boolean ans = check( c, 1, 0, i );
        if( i < c.length ) { ans &= check( c, 0, i+1, c.length ); }
        return ans;
    }

    private boolean check( char[] c, int dots, int l, int r ) {
        boolean sign = c[l] == '+' || c[l] == '-', num = false;
        for( l += (sign ? 1 : 0); l < r; l++ ) {
            if( c[l] == '.' ) {
                if( dots == 0 ) { return false; }
                dots--;
            }
            else if( c[l] < '0' || c[l] > '9' ) { return false; }
            else { num = true; }
        }
        return num;
    }
}
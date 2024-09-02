class Solution {
    public int minSteps(int n) {
        return helper( n, 1, 0, 0 );
    }

    private int helper( int n, int len, int lc, int op ) {
        if( n == len ) { return op; }
        if( n < len ) { return Integer.MAX_VALUE; }
        int ans = helper( n, len + len, len, op + 2 );
        if( lc > 0 ) {
            ans = Math.min( ans, helper( n, len + lc, lc, op + 1 ) );
        }
        return ans;
    }
}
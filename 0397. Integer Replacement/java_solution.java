class Solution {
    public int integerReplacement(int n) {
        return helper( n, 0 ) - (n == Integer.MAX_VALUE ? 1 : 0);
    }

    private int helper( int n, int s ) {
        if( n == 1 ) { return s; }
        int a = helper( n/2, s+1 );
        if( n % 2 == 0 ) { return a; }
        int b = n == Integer.MAX_VALUE ? n : helper(n+1, s+1);
        return Math.min( a+1,b );
    }
}
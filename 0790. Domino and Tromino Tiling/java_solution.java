class Solution {
    public int numTilings(int n) {
        int[] dp = new int[n+1];
        for( int i=0;i<=n;i++ ) {
            if( i < 3 ) { dp[i] = i; continue; }
            if( i == 3 ) { dp[i] = 5; continue; }
            dp[i] = ((2*dp[i-1])% (int)( Math.pow(10,9) + 7.0 ) + dp[i-3]) % (int)( Math.pow(10,9) + 7.0 );
        }
        return dp[n];
    }
}
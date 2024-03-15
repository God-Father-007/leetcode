class Solution {
    public int numDecodings(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        int[] dp = new int[n+1];
        dp[n] = 1;
        dp[n-1] = c[n-1] == '0' ? 0 : 1 ;
        for( int i = n-2; i >= 0; i-- ) {
            if( c[i] == '0' ) { continue; }
            dp[i] = dp[i+1];
            if( c[i] == '1' || c[i] == '2' && c[i+1] < '7' ) { dp[i] += dp[i+2]; }
        }
        return dp[0];
    }
}
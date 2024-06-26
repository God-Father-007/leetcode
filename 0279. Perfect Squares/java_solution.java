class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        for( int i = 1; i <= n; i++ ) {
            int min = Integer.MAX_VALUE;
            for( int j = 1; j*j <= i; j++ ) {
                min = min < dp[i-j*j] + 1 ? min : dp[i-j*j] + 1 ;
            }
            dp[i] = min;
        }
        return dp[n];
    }
}
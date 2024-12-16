class Solution {
    public int knightDialer(int n) {
        int[][] from = new int[][]{{4,6,-1},{6,8,-1},{7,9,-1},{4,8,-1},{0,3,9},{-1,-1,-1},{0,1,7},{2,6,-1},{1,3,-1},{2,4,-1}};
        int[][] dp = new int[n][10];
        Arrays.fill( dp[0], 1 );
        for( int i = 1; i < n; i++ ) {
            for( int j = 0; j < 10; j++ ) {
                for( int f : from[j] ) {
                    if( f < 0 ) { continue; }
                    dp[i][j] += dp[i-1][f];
                    dp[i][j] %= 1000000007L;
                }
            }
        }
        long ans = 0;
        for( int v : dp[n-1] ) { ans += v; }
        return (int)( ans % 1000000007L );
    }
}
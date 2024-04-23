class Solution {
    public int maximalSquare(char[][] matrix) {
        int ans = 0, m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m][n];
        for( int i = m - 1; i >= 0; i-- ) {
            for( int j = n - 1; j >= 0; j-- ) {
                if( matrix[i][j] == '0' ) { continue; }
                int a = i<m-1 && j<n-1 ? dp[i+1][j+1] : 0;
                int b = i<m-1 ? dp[i+1][j] : 0;
                int c = j<n-1 ? dp[i][j+1] : 0;
                dp[i][j] = Math.min( a, Math.min(b, c) ) + 1;
                ans = Math.max( ans, dp[i][j] );
            }
        }
        return ans*ans;
    }
}
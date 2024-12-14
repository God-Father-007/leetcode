class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length, ans = Integer.MAX_VALUE;
        for( int i = 1; i < n; i++ ) {
            for( int j = 0; j < n; j++ ) {
                int t = matrix[i-1][j];
                if( j > 0 ) { t = Math.min( t, matrix[i-1][j-1] ); }
                if( j < n-1 ) { t = Math.min( t, matrix[i-1][j+1] ); }
                matrix[i][j] += t;
                if( i == n-1 ) { ans = Math.min( ans, matrix[i][j] ); }
            }
        }
        return n == 1 ? matrix[0][0] : ans;
    }
}
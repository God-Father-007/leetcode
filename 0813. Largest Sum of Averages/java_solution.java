class Solution {
    public double largestSumOfAverages(int[] nums, int k) {
        int n = nums.length;
        double[][] dp = new double[k][n];
        int sum = 0;
        for( int i = 0; i < n; i++ ) {
            sum += nums[i];
            dp[0][i] = sum*1.0 / (i+1) ;
        }
        for( int i = 1; i < k; i++ ) {
            for( int j = i; j < n; j++ ) {
                sum = 0;
                for( int x = j; x >= i; x-- ) {
                    sum += nums[x];
                    dp[i][j] = Math.max( dp[i][j], dp[i-1][x-1] + ( sum * 1.0 / (j-x+1) ) );
                }
            }
        }
        return dp[k-1][n-1];
    }
}
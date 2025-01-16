class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n+1];
        for( int i = n-1; i >= 0; i-- ) {
            dp[i] = arr[i] + dp[i+1];
            int currMax = arr[i];
            for( int l = 1; l < k && i+l <= n-1; l++ ) {
                if( currMax < arr[i+l] ) { currMax = arr[i+l]; }
                int temp = currMax*(l+1) + dp[i+l+1] ;
                if( dp[i] < temp ) { dp[i] = temp; }
            }
        }
        return dp[0];
    }
}
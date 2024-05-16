class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 1;
        int ans = dp[0];
        for( int i = 1; i < n; i++ ) {
            int temp = 0;
            for( int j = i-1; j >= 0; j-- ) {
                if( nums[j] < nums[i] ) {
                    temp = Math.max( temp, dp[j] );
                }
            }
            dp[i] = temp+1;
            ans = Math.max( ans, dp[i] );
        }
        return ans;
    }
}
class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        for( int i=nums.length-2;i>=0;i-- ) {
            int min = Integer.MAX_VALUE;
            for( int j=i+1;j<nums.length && j<=i+nums[i];j++ ) {
                min = Math.min( min,dp[j] );
            }
            dp[i] = min == Integer.MAX_VALUE ? Integer.MAX_VALUE : min+1 ;
        }
        return dp[0];
    }
}
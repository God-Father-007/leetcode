class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[nums.length-1] = true;
        for( int i=nums.length-2;i>=0;i-- ) {
            for( int j=i+1;j<nums.length && j <= i+nums[i];j++ ) {
                dp[i] |= dp[j];
            }
        }
        return dp[0];
    }
}
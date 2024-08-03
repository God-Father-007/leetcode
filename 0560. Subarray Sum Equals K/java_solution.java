class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for( int i = 1; i < nums.length; i++ ) {
            sum[i] = sum[i-1] + nums[i];
        }
        for( int i = 0; i < sum.length; i++ ) {
            if( sum[i] == k ) { ans++; }
            for( int j = 0; j < i; j++ ) {
                if( sum[i] - sum[j] == k ) { ans++; }
            }
        }
        return ans;
    }
}
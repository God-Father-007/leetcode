class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = Integer.MIN_VALUE;
        for( int i=0;i+k <= nums.length;i++ ) {
            double sum = 0.00;
            for( int j=i;j<i+k;j++ ) {
                sum += nums[j];
            }
            ans = Math.max( ans, sum/k );
        }
        return ans;
    }
}
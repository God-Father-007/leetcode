class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int i=0, j=1;
        int ans = Integer.MIN_VALUE;
        while(j < nums.length) {
            if( nums[j] <= nums[j-1] ) {
                ans = Math.max( ans, j-i );
                i=j;
            }
            j++;
        }
        ans = Math.max( ans, j-i );
        return ans;
    }
}
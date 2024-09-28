class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0, i = 0, j = 0;
        long prod = 1L;
        while( j < nums.length ) {
            prod *= nums[j];
            if( prod < k ) { j++; }
            else {
                ans += j-i;
                prod /= nums[i++];
                if( j <= i ) {
                    prod = 1L; j = i;
                } else {
                    prod /= nums[j];
                }
            }
        }
        j -= i;
        return ans + j*(j+1) / 2;
    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        if( nums.length == 1 ) { return nums[0]; }
        int max_so_far = nums[0];
        int max_ending_here = 0;

        for(int e : nums) {
            max_ending_here = max_ending_here + e;
            if(max_so_far < max_ending_here) {max_so_far = max_ending_here;}
            if(max_ending_here < 0) {max_ending_here = 0;}
        }
    
        return max_so_far;
    }
}
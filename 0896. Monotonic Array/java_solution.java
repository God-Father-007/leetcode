class Solution {
    public boolean isMonotonic(int[] nums) {
        if( nums.length == 1 ) { return true; }
        boolean i = nums[0] <= nums[1], d = nums[0] >= nums[1];
        for(int x=2;x<nums.length;x++) {
            i &= nums[x-1] <= nums[x];
            d &= nums[x-1] >= nums[x];
        }
        return i||d;
    }
}
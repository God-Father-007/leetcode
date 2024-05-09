class Solution {
    public void moveZeroes(int[] nums) {
        if( nums.length < 2 ) { return; }
        int i=0, j = 0;
        while( i<nums.length ) {
            if( j < nums.length && nums[j] != 0 ) { i++; j++; continue; }
            while( i < nums.length && nums[i] == 0 ) { i++; }
            if( i == nums.length ) { return; }
            nums[j] = nums[i] + nums[j];
            nums[i] = nums[j] - nums[i];
            nums[j] = nums[j] - nums[i];
        }
    }
}
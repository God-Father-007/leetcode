class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if( nums.length < 3 ) { return nums[ nums.length-1 ]; }
        int i=nums.length - 1;
        while( i > 0 && nums[i-1] == nums[i] ) { i--; }
        if( i <= 0 ) { return nums[ nums.length-1 ]; }
        i--;
        while( i > 0 && nums[i-1] == nums[i] ) { i--; }
        if( i == 0 ) { return nums[ nums.length-1 ]; }
        i--;
        return nums[i];
    }
}
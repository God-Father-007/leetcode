class Solution {
    public int maximumGap(int[] nums) {
        if( nums.length <= 1 ) { return 0; }
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for( int i=0;i<nums.length-1;i++ ) {
            max = Math.max( max, Math.abs( nums[i]-nums[i+1] ) );
        }
        return max;
    }
}
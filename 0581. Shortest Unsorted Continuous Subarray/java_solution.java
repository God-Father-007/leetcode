class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int i = 0, j = 0;
        int val = nums[0];
        for( int k=1;k<nums.length;k++ ) {
            if( nums[k] < val ) { j = k; }
            val = Math.max( val, nums[k] );
        }
        val = nums[nums.length-1];
        for( int k=nums.length-2;k>=0;k-- ) {
            if( nums[k] > val ) { i = k; }
            val = Math.min( val, nums[k] );
        }
        return i >= j ? 0 : j-i+1;
    }
}
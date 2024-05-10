class Solution {
    public int findDuplicate(int[] nums) {
        for( int n : nums ) {
            n = Math.abs(n);
            if( nums[n-1] < 0 ) { return n; }
            nums[n-1] = -nums[n-1];
        }
        return -1;
    }
}
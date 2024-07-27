class Solution {
    public int singleNonDuplicate(int[] nums) {
        return helper( nums, 0, nums.length-1 );
    }

    private int helper( int[] nums, int l, int r ) {
        if( l == r ) { return nums[l]; }
        int m = ( l + r ) / 2;
        if( m > l && nums[m-1] == nums[m] ) {
            boolean odd = (m - l + 1) % 2 == 1 ;
            return helper( nums, odd ? l : m+1, odd ? m : r  );
        }
        else if( m < r && nums[m+1] == nums[m] ) {
            boolean odd = (r - m + 1) % 2 == 1 ;
            return helper( nums, odd ? m : l, odd ? r : m-1  );
        }
        return nums[m];
    }
}
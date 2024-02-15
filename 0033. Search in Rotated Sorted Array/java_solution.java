class Solution {
    
    public int search(int[] nums, int target) {
        if( nums.length == 1 ) { return nums[0] == target ? 0 : -1; }
        int l = 0, r = nums.length-1;
        while( l <= r ) {
            int m = (l+r)/2;
            if( nums[m] == target ) { return m; }
            
            if( nums[l] <= nums[m] ) {
                if( target >= nums[l] && target < nums[m] ) {
                    r = m-1;
                } else { l = m+1; }
            } else if( nums[m] <= nums[r] ) {
                if( target > nums[m] && target <= nums[r] ) {
                    l = m+1;
                } else { r = m-1; }
            }
        }
        return -1;
    }
}
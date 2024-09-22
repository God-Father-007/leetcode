class Solution {
    public int search(int[] nums, int tar) {
        int i=0, j=nums.length-1;
        while( i <= j ) {
            int m = (i+j)/2;
            if( nums[m] == tar ) { return m; }
            else if( nums[m] > tar ) { j = m-1; }
            else { i = m+1; }
        }
        return -1;
    }
}
class Solution {
    public void sortColors(int[] nums) {
        int i=0, j=nums.length-1;
        for( int val = 2;val>0;val-- ) {
            while( i < j ) {
                if( nums[j] == val ) { j--; continue; }
                if( nums[i] == val ) {
                    nums[i] += nums[j]; nums[j] = nums[i] - nums[j]; nums[i] -= nums[j];
                    j--;
                }
                if( nums[j] == val ) { j--; continue; }
                i++;
            }
            i = 0;
        }
    }
}
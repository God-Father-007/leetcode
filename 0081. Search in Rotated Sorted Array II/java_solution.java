class Solution {
    public boolean search(int[] nums, int target) {
        int k = 0;
        for( int i=0;i<nums.length-1;i++ ) {
            if( nums[i] > nums[i+1] ) { break; }
            k++;
        }
        k++;
        int idx = 0;
        if( target >= nums[0] ) { idx = Arrays.binarySearch( nums, 0, k, target ); }
        else { idx = Arrays.binarySearch( nums, k, nums.length, target ); }
        return idx >= 0 ;
    }
}
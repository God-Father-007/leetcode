class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        while( i < nums.length && nums[i] < 0 ) {
            if( k == 0 ) { break; }
            nums[i] = -nums[i];
            k--;
            i++;
        }
        Arrays.sort(nums);
        i = 0;
        if( i < nums.length ) {
            if( nums[i] >= 0 ) {
                if( k%2 == 1 ) { nums[i] = -nums[i]; }
                k = 0;
            }
        }
        int sum = 0;
        for( int n : nums ) { sum += n; }
        return sum;
    }
}
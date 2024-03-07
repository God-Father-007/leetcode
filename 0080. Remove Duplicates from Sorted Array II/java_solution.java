class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0, i = 0, j = i+1, ans = 0;
        while( j < nums.length-k ) {
            while( j < nums.length-k && nums[i] == nums[j] ) { j++; }
            if( j-i > 2 ) {
                i += 2;
                for( int x = j;x<nums.length-k;x++ ) {
                    nums[x-j+i] = nums[x];
                }
                k += j-i;
                j = i+1;
            } else { i=j; j++; }
        }
        return nums.length - k;
    }
}
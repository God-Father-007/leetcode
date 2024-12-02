class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0, j=nums.length-1;
        while(true) {
            while( i < nums.length && nums[i]%2 == 0 ) { i++; }
            while( j >= 0 && nums[j]%2 == 1 ) { j--; }
            if( j < i ) { break; }
            nums[i] ^= nums[j];
            nums[j] ^= nums[i];
            nums[i] ^= nums[j];
        }
        return nums;
    }
}
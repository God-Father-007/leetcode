class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, i = 0, j = n-1;
        int[] ans = new int[n];
        for( int idx = n-1; idx >= 0; idx-- ) {
            if( Math.abs( nums[i] ) > Math.abs( nums[j] ) ) {
                ans[idx] = nums[i] * nums[i];
                i++;
            } else {
                ans[idx] = nums[j] * nums[j];
                j--;
            }
        }
        return ans;
    }
}
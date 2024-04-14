class Solution {
    public int rob(int[] nums) {
        int n = nums.length, n1 = nums[0], n2 = 0;
        for( int i = 1; i < n; i++ ) {
            int temp = n1;
            n1 = Math.max( nums[i]+n2, n1 );
            n2 = temp;
        }
        return Math.max( n1, n2 );
    }
}
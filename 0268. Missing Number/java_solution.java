class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length, sum = 0;
        for( int v : nums ) { sum += v; }
        return n*(n+1)/2 - sum ;
    }
}
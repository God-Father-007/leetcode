class Solution {
    public int[] findErrorNums(int[] nums) {
        int repeating = 0, missing = 0;
        for( int v : nums ) {
            v = Math.abs(v);
            if( nums[v-1] < 0 ) { repeating = v; }
            nums[v-1] = -nums[v-1];
        }
        for( int i = 0; i < nums.length; i++ ) {
            if( nums[i] > 0 && i+1 != repeating ) {
                missing = i+1; break;
            }
        }
        return new int[]{ repeating, missing };
    }
}
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int e = 0, o = 1;
        int[] ans = new int[nums.length];
        for( int n : nums ) {
            if( n%2 == 0 ) { ans[e] = n; e += 2; }
            else { ans[o] = n; o += 2; }
        }
        return ans;
    }
}
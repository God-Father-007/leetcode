class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for( int i = 0; i < ans.length; i++ ) {
            int x = i;
            while( x > 0 ) {
                ans[i]++;
                x -= x & -x;
            }
        }
        return ans;
    }
}
class Solution {
    
    private void helper( int[] a, int tar, int[] ans, int l, int r ) {
        if( l > r ) { return; }
        int m = (l+r)/2;
        if( a[m] == tar ) {
            ans[0] = Math.min(ans[0],m);
            ans[1] = Math.max(ans[1],m);
            helper( a, tar, ans, l, m-1 );
            helper( a, tar, ans, m+1, r );
        }
        else if( a[m] > tar ) {
            helper( a, tar, ans, l, m-1 );
        } else {
            helper( a, tar, ans, m+1, r );
        }
    }
    
    public int[] searchRange(int[] nums, int target) {
        int[] ans = { Integer.MAX_VALUE, Integer.MIN_VALUE };
        helper( nums, target, ans, 0, nums.length-1 );
        if( ans[0] == Integer.MAX_VALUE ) { ans[0] = -1; ans[1] = -1; }
        return ans;
    }
}
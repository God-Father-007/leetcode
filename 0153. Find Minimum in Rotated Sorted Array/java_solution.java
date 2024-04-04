class Solution {
    public int findMin(int[] arr) {
        if( arr.length == 1 ) { return arr[0]; }
        int l = 0, r = arr.length-1;
        int ans = Integer.MAX_VALUE;
        while( l < r ) {
            int m = (l+r)/2;
            ans = Math.min( ans, arr[m] );
            if( arr[l] < arr[m] ) {
                ans = Math.min( ans, arr[l] );
                l = m;
            } else {
                ans = Math.min( ans, arr[r] );
                r = m;
            }
        }
        return ans;
    }
}
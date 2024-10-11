class Solution {
    public int dominantIndex(int[] nums) {
        if( nums.length == 1 ) { return 0; }
        int[] a = Arrays.copyOf( nums, nums.length );
        Arrays.sort( a );
        if ( 2*a[a.length-2] > a[a.length-1] ) { return -1; }
        for( int i=0;i<nums.length;i++ ) {
            if( nums[i] == a[a.length-1] ) { return i; }
        }
        return -1;
    }
}
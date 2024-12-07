class Solution {
    public int partitionDisjoint(int[] nums) {
        int l = nums.length;
        int[] rmin = new int[l];
        rmin[l-1] = nums[l-1];
        for( int i=l-2;i>=0;i-- ) {
            rmin[i] = Math.min( rmin[i+1], nums[i] );
        }
        int max = nums[0];
        for( int i=0;i<l-1;i++ ) {
            max = Math.max( max, nums[i] );
            if( max <= rmin[i+1] ) { return i+1; }
        }
        return l-1;
    }
}
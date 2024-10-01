class Solution {
    public int pivotIndex(int[] nums) {
        int l = nums.length;
        int[] pre = new int[l];
        int[] post = new int[l];
        pre[0] = nums[0];
        post[l-1] = nums[l-1];
        for( int i=1;i<l;i++ ) {
            pre[i] = nums[i] + pre[i-1];
            post[l-1-i] = nums[l-1-i] + post[l-i];
        }
        for( int i=0;i<l;i++ ) {
            if( pre[i] == post[i] ) { return i; }
        }
        return -1;
    }
}
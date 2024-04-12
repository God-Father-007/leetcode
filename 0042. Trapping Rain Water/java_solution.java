class Solution {
    public int trap(int[] height) {
        int n = height.length, max = 0, water = 0;
        int[] postMax = new int[n];
        for( int i = n-1; i >= 0; i-- ) {
            if( height[i] > max ) { max = height[i]; }
            postMax[i] = max;
        }
        max = 0;
        for( int i = 0; i < n; i++ ) {
            if( height[i] > max ) { max = height[i]; }
            water += ( max < postMax[i] ? max : postMax[i] ) - height[i];
        }
        return water;
    }
}
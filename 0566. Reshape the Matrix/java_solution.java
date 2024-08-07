class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int y = nums[0].length;
        if( nums.length*y != r*c ) { return nums; }
        int[][] ans = new int[r][c];
        for( int i=0;i<r*c;i++ ) {
            ans[i/c][i%c] = nums[i/y][i%y];
        }
        return ans;
    }
}
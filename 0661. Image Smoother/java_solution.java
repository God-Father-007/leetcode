class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length;
        int[][] ans = new int[m][n];
        int[][] drxn = new int[][]{ {-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1} };
        for( int i = 0; i < m; i++ ) {
            for( int j = 0; j < n; j++ ) {
                int len = 1;
                ans[i][j] = img[i][j];
                for( int[] d : drxn ) {
                    int r = i + d[0], c = j + d[1];
                    if( r < 0 || r >= m || c < 0 || c >= n ) { continue; }
                    ans[i][j] += img[r][c];
                    len++;
                }
                ans[i][j] /= len;
            }
        }
        return ans;
    }
}
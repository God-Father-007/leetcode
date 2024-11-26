class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] ans = new int[rows*cols][2];
        int x = 0;
        int l = cStart, t = rStart, r = cStart, b = rStart;
        int i = rStart, j = cStart;
        ans[x++] = new int[]{i,j};
        while( x < ans.length ) {
            i = t;

            l--;
            t--;
            r++;
            b++;

            j = r;

            while( i <= b ) {
                if( x < ans.length && i >= 0 && i < rows && j >= 0 && j < cols ) { ans[x++] = new int[]{i,j}; }
                i++;
            }
            i--;
            j--;
            while( j >= l ) {
                if( x < ans.length && i >= 0 && i < rows && j >= 0 && j < cols ) { ans[x++] = new int[]{i,j}; }
                j--;
            }
            j++;
            i--;
            while( i >= t ) {
                if( x < ans.length && i >= 0 && i < rows && j >= 0 && j < cols ) { ans[x++] = new int[]{i,j}; }
                i--;
            }
            i++;
            j++;
            while( j <= r ) {
                if( x < ans.length && i >= 0 && i < rows && j >= 0 && j < cols ) { ans[x++] = new int[]{i,j}; }
                j++;
            }
            j--;
        }
        return ans;
    }
}
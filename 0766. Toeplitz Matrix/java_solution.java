class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        if( n == 1 || m == 1 ) { return true; }
        for( int i=n-2;i>=0;i-- ) {
            for( int j=m-2;j>=0;j-- ) {
                if( matrix[i+1][j+1] != matrix[i][j] ) { return false; }
            }
        }
        return true;
    }
}
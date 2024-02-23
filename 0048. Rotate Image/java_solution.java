class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int i=0, j=1;
        while( j < n ) {
            matrix[i][i+j] += matrix[i+j][i];
            matrix[i+j][i] = matrix[i][i+j] - matrix[i+j][i];
            matrix[i][i+j] -= matrix[i+j][i];
            i++;
            if( i+j == n ) { i = 0; j++; }
        }
        i = 0;
        while( i < n ) {
            for( j=0;j<n/2;j++ ) {
                matrix[i][j] += matrix[i][n-1-j];
                matrix[i][n-1-j] = matrix[i][j] - matrix[i][n-1-j];
                matrix[i][j] -= matrix[i][n-1-j];
            }
            i++;
        }
    }
}
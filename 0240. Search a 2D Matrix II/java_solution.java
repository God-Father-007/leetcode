class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int c = Arrays.binarySearch( matrix[0], target );
        c = Math.abs(c+1);
        for( int i=0; i<matrix.length; i++ ) {
            if( matrix[i][0] > target ) { break; }
            int idx = Arrays.binarySearch( matrix[i], 0, c, target );
            if( idx >= 0 ) { return true; }
        }
        return false;
    }
}
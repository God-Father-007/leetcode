class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        while( i < matrix.length && matrix[i][0] <= target ) { i++; }
        i--;
        if( i < 0 ) { return false; }
        int j = Arrays.binarySearch( matrix[i], target );
        if( j < 0 ) { return false; }
        return true;
    }
}
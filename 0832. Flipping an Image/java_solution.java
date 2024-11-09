class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for( int i=0;i<n;i++ ) {
            for( int j=0;j<n/2;j++ ) {
                image[i][j] ^= 1;
                image[i][n-1-j] ^= 1;
                image[i][j] += image[i][n-1-j];
                image[i][n-1-j] = image[i][j] - image[i][n-1-j];
                image[i][j] = image[i][j] - image[i][n-1-j];
            }
            if( n%2 == 1 ) { image[i][n/2] ^= 1; }
        }
        return image;
    }
}
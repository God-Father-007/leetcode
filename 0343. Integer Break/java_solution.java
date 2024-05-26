class Solution {

    public int integerBreak(int n) {
        int[] a = new int[n+1];
        for( int i=2; i<a.length; i++ ) {
            for( int j=1; j<=i/2; j++ ) {
                a[i] = Math.max( a[i], Math.max( (i-j)*j, a[i-j]*j ) );
            }
        }
        return a[n];
    }
}
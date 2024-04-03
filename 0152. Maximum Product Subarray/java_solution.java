class Solution {
    public int maxProduct(int[] a) {
        int f = 1, b = 1, n = a.length, max = Integer.MIN_VALUE;
        boolean zero = false;
        for( int i=0;i<n;i++ ) {
            if( a[i] == 0 ) { f = 1; zero = true; continue; }
            f *= a[i];
            max = Math.max(max, f);
        }
        for( int i=n-1;i>=0;i-- ) {
            if( a[i] == 0 ) { b = 1; zero = true; continue; }
            b *= a[i];
            max = Math.max(max, b);
        }
        if( zero && max < 0 ) { max = 0; }
        return max;
    }
}
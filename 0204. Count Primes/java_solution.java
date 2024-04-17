class Solution {
    public int countPrimes(int n) {
        if( n<3 ) { return 0; }
        int count = 1;
        for( int i=3;i<n;i=i+2 ) {
            boolean flag = true;
            for(int j=2;j*j<=i;j++) {
                if( i%j == 0 ) { flag = false; break; }
            }
            if( flag ) { count++; }
        }
        return count;
    }
}
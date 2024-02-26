class Solution {
    public String getPermutation(int n, int k) {
        char[] ans = new char[n];
        int mod = factorial(n), picked = 0;
        for( int i = 0; i < n; i++ ) {
            mod /= (n - i);
            int start = k / mod + (k % mod == 0 ? 0 : 1);
            k = k % mod == 0 ? mod : k % mod ;
            start = kthSmallest( n, start, picked );
            picked = picked | ( 1 << start );
            ans[i] = (char)(start + '0');
        }
        return new String(ans);
    }

    private int kthSmallest( int n, int k, int picked ) {
        for( int x = 1, count = 0; x <= n; x++ ) {
            if( ((1 << x) & picked) == 0 ) { count++; }
            if( count == k ) { return x; }
        }
        return 0;
    }

    private int factorial( int n ) {
        return n < 2 ? 1 : n*factorial(n-1);
    }
}
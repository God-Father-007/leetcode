class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long ans = 0, mod = 1000000007;
        int[] l = nextSmallest(arr, 0, 1);
        int[] r = nextSmallest(arr, n-1, -1);
        for( int i = 0; i < n; i++ ) {
            int a = i - l[i], b = r[i];
            while( b < n && arr[i] == arr[b] ) { b = r[b]; }
            b -= i;
            ans += ( 1L * a * b * arr[i]);
            ans %= mod;
        }
        return (int)ans;
    }

    private int[] nextSmallest( int[] a, int start, int inc ) {
        int n = a.length, base = inc == 1 ? -1 : n;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        for( int i = start; i != base + inc*(n+1); i += inc ) {
            while( s.size() > 0 && a[s.peek()] > a[i] ) { s.pop(); }
            ans[i] = ( s.size() == 0 ? base : s.peek() );
            s.push( i );
        }
        return ans;
    }
}
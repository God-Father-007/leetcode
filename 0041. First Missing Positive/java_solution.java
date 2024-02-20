class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean one = false;
        for( int i=0;i<n;i++ ) {
            if( arr[i] == 1 ) { one = true; }
            if( arr[i] <= 0 || arr[i] > n ) { arr[i] = 1; }
        }
        if( !one ) { return 1; }
        for( int i=0;i<n;i++ ) {
            int x = Math.abs(arr[i]);
            if( arr[x-1] <= 0 ) { continue; }
            arr[x-1] = -arr[x-1];
        }
        int ans = 0;
        boolean found = false;
        for( int i=0;i<n;i++ ) {
            if( arr[i] > 0 ) { ans = i; found = true; break; }
        }
        return found ? ans + 1 : n + 1 ;
    }
}
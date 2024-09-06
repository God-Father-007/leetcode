class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int[] abs = new int[arr.length];
        int l = 0;
        for( int i = 0; i < abs.length; i++ ) {
            abs[i] = Math.abs( arr[i] - x );
            if( abs[i] < abs[l] ) { l = i; }
        }
        int r = l;
        while( l >= 0 && r < abs.length && r - l - 1 < k ) {
            if( abs[l] <= abs[r] ) { l--; }
            else { r++; }
        }
        while( l >= 0 && r - l - 1 < k ) { l--; }
        while( r < abs.length && r - l - 1 < k ) { r++; }
        List<Integer> ans = new ArrayList<>();
        while( ++l < r ) { ans.add( arr[l] ); }
        return ans;
    }
}
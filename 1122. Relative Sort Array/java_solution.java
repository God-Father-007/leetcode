class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> m = new HashMap<>();
        for( int n : arr1 ) { m.put( n, m.getOrDefault(n,0) + 1 ); }
        int i = 0;
        for( int n : arr2 ) {
            int f = m.get(n);
            while( f > 0 ) { arr1[i++] = n; f--; }
            m.remove(n);
        }
        int start = i;
        for( int k : m.keySet() ) {
            int f = m.get(k);
            while( f > 0 ) { arr1[i++] = k; f--; }
        }
        Arrays.sort( arr1, start, arr1.length );
        return arr1;
    }
}
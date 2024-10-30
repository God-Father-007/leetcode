class Solution {
    public int expressiveWords(String s, String[] words) {
        int ans = 0;
        List<Integer> f = freq( s );
        for( String word : words ) {
            List<Integer> w = freq( word );
            if( f.size() != w.size() ) { continue; }
            ans++;
            for( int i = 0; i < w.size(); i += 2 ) {
                if( f.get(i) != w.get(i) || f.get(i+1) < w.get(i+1) || f.get(i+1) < 3 && f.get(i+1) != w.get(i+1) ) {
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
    private List<Integer> freq(String s) {
        char[] c = s.toCharArray();
        List<Integer> l = new ArrayList<>();
        int i = 0;
        while( i < c.length ) {
            int j = i;
            while( j < c.length && c[i] == c[j] ) { j++; }
            l.add( (int)c[i] );
            l.add( j-i );
            i = j;
        }
        return l;
    }
}
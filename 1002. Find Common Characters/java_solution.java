class Solution {
    public List<String> commonChars(String[] words) {
        char[] common = words[0].toCharArray();
        Arrays.sort( common );
        for( String w : words ) {
            char[] c = w.toCharArray();
            Arrays.sort( c );
            common = intersection( common, c );
        }
        List<String> ans = new ArrayList<>();
        for( char c : common ) { ans.add( c+"" ); }
        return ans;
    }

    private char[] intersection( char[] a, char[] b ) {
        int i = 0, j = 0;
        List<Character> common = new ArrayList<>();
        while( i < a.length && j < b.length ) {
            if( a[i] < b[j] ) { i++; }
            else if( a[i] > b[j] ) { j++; }
            else {
                common.add( a[i] );
                i++; j++;
            }
        }
        char[] ans = new char[common.size()];
        for( i = 0; i < ans.length; i++ ) { ans[i] = common.get(i); }
        return ans;
    }
}
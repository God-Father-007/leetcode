class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> f = new HashMap<>();
        for( int i = 0 ; i < s.length() ; i++ ) {
            char c = s.charAt(i);
            if( !f.containsKey( c ) ) { f.put( c , 1 ); continue; }
            f.put( c , f.get( c ) + 1 );
        }
        boolean odd = false;
        int l = 0;
        for( char k : f.keySet() ) {
            if( f.get(k)%2 == 0 ) { l += f.get(k); }
            else { odd = true; l += f.get(k) - 1; }
        }
        if( odd ) { l++; }
        return l;
    }
}
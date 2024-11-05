class Solution {
    public int[] shortestToChar(String s, char c) {
        int curr = -1, next = -1, i = 0;
        int[] ans = new int[s.length()];
        Arrays.fill( ans, Integer.MAX_VALUE );
        while( i < s.length() ) {
            for( int x = i;x < s.length();x++ ) {
                if( s.charAt(x) == c ) { curr = next; next = x; break; }
                else if( x == s.length()-1 ) { curr = next; next = s.length(); break; }
            }
            while( i <= next ) {
                if( i == s.length() ) { break; }
                if( next < s.length() ) { ans[i] = next - i; }
                if( curr >= 0 ) { ans[i] = Math.min( ans[i], i - curr ); }
                i++;
            }
        }
        return ans;
    }
}
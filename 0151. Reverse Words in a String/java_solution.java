class Solution {
    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        int l = 0;
        for( int i = 0; i < c.length; i++ ) {
            if( c[i] == ' ' ) {
                if( l > 0 ) { ans.insert( 0, ' ' ); l = 0; }
                continue;
            }
            ans.insert( l++, c[i] );
        }
        if( ans.charAt(0) == ' ' ) { ans.deleteCharAt(0); }
        return ans.toString();
    }
}
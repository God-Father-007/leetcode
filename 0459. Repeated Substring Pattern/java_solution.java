class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for( int i=1;i<=s.length()/2;i++ ) {
            String c = s.substring(0,i);
            if( s.length()%c.length() != 0 ) { continue; }
            String t = s.replaceAll( c , "" );
            if( t.equals("") ) { return true; }
        }
        return false;
    }
}
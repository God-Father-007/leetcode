class Solution {
    public int titleToNumber(String s) {
        if( s.length() == 0 ) { return 0; }
        return ( s.charAt( s.length()-1 ) - '@' ) + titleToNumber( s.substring(0, s.length()-1) )*26;
    }
}
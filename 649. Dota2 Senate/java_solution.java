class Solution {
    public String predictPartyVictory(String senate) {
        StringBuilder s = new StringBuilder( senate );
        int i = 0, r = 0, d = 0;
        char first = s.charAt(0);
        boolean allSame = true;
        while( true ) {
            if( i == s.length() ) {
                if( allSame ) { break; }
                first = s.charAt(0);
                allSame = true;
                i = 0; continue;
            }
            allSame &= first == s.charAt(i);
            if( s.charAt(i) == 'R' ) {
                if( r > 0 ) { r--; s.deleteCharAt(i); }
                else { d++; i++; }
            } else {
                if( d > 0 ) { d--; s.deleteCharAt(i); }
                else { r++; i++; }
            }
        }
        return s.charAt(0) == 'R' ? "Radiant" : "Dire" ;
    }
}
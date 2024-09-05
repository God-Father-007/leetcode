class Solution {
    public boolean judgeCircle(String moves) {
        int r = 0, l = 0, u = 0, d = 0;
        for( int i=0;i<moves.length();i++ ) {
            char c = moves.charAt(i);
            if( c == 'R' ) { r++; }
            else if( c == 'L' ) { l++; }
            else if( c == 'U' ) { u++; }
            else { d++; }
        }
        if( r == l && u == d ) { return true; }
        return false;
    }
}
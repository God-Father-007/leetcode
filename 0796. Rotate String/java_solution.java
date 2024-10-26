class Solution {
    public boolean rotateString(String s, String goal) {
        if( s.length() != goal.length() ) { return false; }
        if( s.equals(goal) ) { return true; }
        for( int i=0;i<s.length()-1;i++ ) {
            String t = s.substring(i+1) + s.substring( 0,i+1 );
            if( t.equals(goal) ) { return true; };
        }
        return false;
    }
}
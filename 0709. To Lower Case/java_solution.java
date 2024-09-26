class Solution {
    public String toLowerCase(String s) {
        char[] c = s.toCharArray();
        for( int i = 0; i < c.length; i++ ) {
            if( c[i] > 64 && c[i] < 91 ) { c[i] = (char)(c[i] + 32); }
        }
        return new String(c);
    }
}
class Solution {
    public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        int[] f = new int[26];
        for( char x : c ) { f[x-'a']++; }
        for( int i = 0; i < c.length; i++ ) {
            if( f[ c[i] -'a'] == 1 ) { return i; }
        }
        return -1;
    }
}
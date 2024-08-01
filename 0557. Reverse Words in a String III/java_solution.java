class Solution {
    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = 0;
        while( i < c.length ) {
            if( j < c.length && c[j] != ' ' ) { j++; continue; }
            for( int k=j-1; k>i; k-- ) {
                c[k] ^= c[i];
                c[i] ^= c[k];
                c[k] ^= c[i];
                i++;
            }
            j++;
            i = j;
        }
        return new String(c);
    }
}
class Solution {
    public int compress(char[] chars) {
        int m = 0, i = 0, j = 0;
        while( j < chars.length ) {
            while( j < chars.length && chars[i]==chars[j] ) {
                j++;
            }
            int l = j-i;
            chars[m++] = chars[i];
            if( l > 1 ) {
                int p = m-1;
                while( l > 0 ) {
                    chars[m++] = (char)( (l%10) + '0' );
                    l /= 10;
                }
                int q = m;
                while( ++p < --q ) {
                    char temp = chars[p];
                    chars[p] = chars[q];
                    chars[q] = temp;
                }
            }
            i = j;
        }
        return m;
    }
}
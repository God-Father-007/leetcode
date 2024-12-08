class Solution {
    
    private boolean isLetter(char c) {
        int x = c-'a';
        if( x >=0 && x < 26 ) { return true; }
        x = c-'A';
        if( x >=0 && x < 26 ) { return true; }
        return false;
    }
    
    public String reverseOnlyLetters(String s) {
        char[] a = s.toCharArray();
        int i=0, j=a.length-1;
        while( i < j ) {
            boolean i_isLetter = isLetter(a[i]), j_isLetter = isLetter(a[j]);
            if( !i_isLetter && !j_isLetter ) {
                i++;
                j--;
            } else if( !i_isLetter ) { i++; }
            else if( !j_isLetter ) { j--; }
            else {
                char c = a[i];
                a[i] = a[j];
                a[j] = c;
                i++;
                j--;
            }
        }
        return String.valueOf(a);
    }
}
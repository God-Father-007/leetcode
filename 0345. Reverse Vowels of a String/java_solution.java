class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int i=0, j=c.length-1;
        while( i < j ) {
            while( i < j && !isVowel(c[i]) ) { i++; }
            while( i < j && !isVowel(c[j]) ) { j--; }
            if( i >= j ) { break; }
            char x = c[i];
            c[i] = c[j];
            c[j] = x;
            i++;
            j--;
        }
        return new String(c);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u' || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }
}
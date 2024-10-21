class Solution {

    List<String> ans;
    public List<String> letterCasePermutation(String s) {
        ans = new ArrayList<>();
        helper( s.toCharArray(), 0 );
        return ans;
    }

    private void helper( char[] c, int i ) {
        if( i == c.length ) {
            ans.add( new String(c) );
            return;
        }
        helper( c, i+1 );
        if( c[i] < 58 ) { return; }
        c[i] = reverseCase( c[i] );
        helper( c, i+1 );
        c[i] = reverseCase( c[i] );
    }

    private char reverseCase( char x ) {
        return (char)(x + ( x < 91 ? 32 : -32 ) );
    }
}
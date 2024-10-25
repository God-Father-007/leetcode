class Solution {
    public String customSortString(String order, String s) {
        StringBuilder ans = new StringBuilder();
        char[] o = order.toCharArray();
        char[] c = s.toCharArray();
        int[] f = new int[26];
        for( char x : c ) { f[x-'a']++; }
        for( char x : o ) {
            ans.append( (x+"").repeat( f[x-'a'] ) );
            f[x-'a'] = 0;
        }
        for( int i = 0; i < 26; i++ ) {
            ans.append( ((char)(i+'a')+"").repeat( f[i] ) );
        }
        return ans.toString();
    }
}
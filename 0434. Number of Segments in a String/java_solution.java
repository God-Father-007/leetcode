class Solution {
    public int countSegments(String s) {
        char[] c = s.toCharArray();
        int ans = 0;
        boolean word = false;
        for( char x : c ) {
            if( x == ' ' ) { word = false; continue; }
            if( !word ) { ans++; }
            word = true;
        }
        return ans;
    }
}
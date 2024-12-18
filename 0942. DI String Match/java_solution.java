class Solution {
    public int[] diStringMatch(String s) {
        int[] ans = new int[s.length()+1];
        int i=0, d=s.length();
        for( int x=0;x<s.length();x++ ) {
            char c = s.charAt(x);
            if( c == 'I' ) {
                ans[x] = i;
                i++;
            } else {
                ans[x] = d;
                d--;
            }
        }
        ans[s.length()] = i;
        return ans;
    }
}
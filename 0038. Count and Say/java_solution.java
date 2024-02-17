class Solution {
    
    public String mod( String s ) {
        String ans = "";
        int i=0, j=0;
        while(j<s.length()) {
            while(j<s.length() && s.charAt(j) == s.charAt(i)) {
                j++; continue;
            }
            ans += (j-i)+"" + s.charAt(i);
            i=j;
        }
        return ans;
    }
    
    public String countAndSay(int n) {
        if( n == 1 ) { return "1"; }
        return mod(countAndSay(n-1));
    }
}
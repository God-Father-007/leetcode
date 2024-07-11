class Solution {
    public String licenseKeyFormatting(String S, int K) {
        S = S.replaceAll("-","").toUpperCase();
        if( S.equals("") ) { return ""; }
        int l = S.length()%K;
        String ans = S.substring(0,l);
        while( l+K <= S.length() ) {
            ans = ans + "-" + S.substring(l,l+K);
            l += K;
        }
        if( ans.charAt(0) == '-' ) { ans = ans.substring(1); }
        return ans;
    }
}
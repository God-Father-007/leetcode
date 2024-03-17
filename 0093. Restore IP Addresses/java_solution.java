class Solution {
    
    public void helper( String s, int idx, int dots, String asf, List<String> ans ) {
        if( idx == s.length() ) { return; }
        char c = s.charAt(idx);
        if( dots == 0 ) {
            if( idx+3 < s.length() ) { return; }
            if( idx+1 == s.length() ) { ans.add( asf+c ); }
            else if( c != '0' && idx+2 == s.length() ) { ans.add( asf+s.substring(idx) ); }
            else if( c != '0' && idx+3 == s.length() ) {
                int num = Integer.parseInt( s.substring(idx) );
                if( num < 256 ) { ans.add( asf+num ); }
            }
            return;
        }
        helper( s, idx+1, dots-1, asf+c+".", ans );
        if(c != '0') {
            if( idx+2 <= s.length() ) {
                helper( s, idx+2, dots-1, asf+s.substring(idx,idx+2)+".", ans );
            }
            if( idx+3 <= s.length() ) {
                int num = Integer.parseInt( s.substring(idx,idx+3) );
                if( num < 256 ) {
                    helper( s, idx+3, dots-1, asf+num+".", ans );
                }
            }
        }
    }
    
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        if( s.length() < 4 || s.length() > 12 ) { return ans; }
        helper( s, 0, 3, "", ans );
        return ans;
    }
}
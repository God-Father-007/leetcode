class Solution {
    public String reverseStr(String s, int k) {
        if( k < 2 ) { return s; }
        String ans = "";
        int i=0;
        while( i < s.length() ) {
            int t=0;
            if( i+k >= s.length() ) { t = s.length(); } else { t = i+k; }
            StringBuilder sb = new StringBuilder( s.substring(i,t) );
            sb = sb.reverse();
            if( i+k+k >= s.length() ) { t = s.length(); } else { t = i+k+k; }
            ans += sb.toString();
            if( i+k < s.length() ) { ans += s.substring(i+k,t); }
            i += 2*k;
        }
        
        return ans;
    }
}
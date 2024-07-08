class Solution {
    public String validIPAddress(String queryIP) {
        String[] s = (queryIP+" ").split("\\.|:");
        if( s.length != 4 && s.length != 8 ) { return "Neither"; }
        int base = s.length == 4 ? 10 : 16 ;
        for( String x : s ) {
            x = x.trim();
            try{
                if( base == 16 && (x.length() > 4 || x.length() < 1) ) { return "Neither"; }
                int v = Integer.parseInt( x, base );
                if( base == 10 && (v < 0 || v > 255 || !x.equals(v+"")) ) { return "Neither"; }
            } catch(Exception e) {
                return "Neither";
            }
        }
        return base == 10 ? "IPv4" : "IPv6" ;
    }
}
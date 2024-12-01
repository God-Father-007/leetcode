class Solution {
    public String orderlyQueue(String s, int k) {
        if( k > 1 ) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            return new String(c);
        }
        StringBuilder sb = new StringBuilder(s);
        String ans = s;
        int n = sb.length();
        for( int i=0;i<n;i++ ) {
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
            String x = sb.toString();
            if( ans.compareTo(x) > 0 ) { ans = x; }
        }
        return ans;
    }
}
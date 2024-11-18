class Solution {
    public int binaryGap(int n) {
        int ans = 0;
        String s = Integer.toBinaryString(n);
        int i=0, j=1;
        while( j < s.length() ) {
            if( s.charAt(j) == '1' ) {
                ans = Math.max(ans, j-i);
                i=j;
            }
            j++;
        }
        return ans;
    }
}
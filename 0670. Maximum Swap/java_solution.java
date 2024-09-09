class Solution {
    public int maximumSwap(int x) {
        StringBuilder num = new StringBuilder(x+"");
        int n = num.length();
        if( n == 1 ) { return x; }
        int[] maxToRight = new int[n];
        maxToRight[n-1] = num.charAt(n-1)-'0';
        for( int i=n-2;i>=0;i-- ) {
            maxToRight[i] = Math.max( num.charAt(i)-'0', maxToRight[i+1] );
        }
        int si = 0;
        for( int i=0;i<n;i++ ) {
            if( num.charAt(i)-'0' != maxToRight[i] ) {
                si = i;
                break;
            }
        }
        int ei = 0;
        for( int i=n-1;i>si;i-- ) {
            if( maxToRight[si] == maxToRight[i] ) {
                ei = i;
                break;
            }
        }
        char temp = num.charAt(si);
        num.setCharAt(si,num.charAt(ei));
        num.setCharAt( ei, temp );
        return Integer.parseInt(num.toString());
    }
}
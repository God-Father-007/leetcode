class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] result = new int[2];
        int i=0;
        while( i < s.length() ) {
            int pxls = 0;
            while( i < s.length() ) {
                int w = widths[s.charAt(i)-'a'];
                if( pxls + w > 100 ) { break; }
                i++;
                pxls += w;
            }
            result[0]++;
            if( i == s.length() ) { result[1] = pxls; }
        }
        return result;
    }
}
class Solution {
    public int[] constructRectangle(int area) {
        int gap = area;
        int[] ans = new int[2];
        for( int i=1;i<=Math.sqrt(area);i++ ) {
            int x = area/i;
            if( x - i < gap && x*i == area ) {
                gap = area/i - i;
                ans[0] = Math.max( x , i );
                ans[1] = Math.min( x , i );
            }
        }
        return ans;
    }
}
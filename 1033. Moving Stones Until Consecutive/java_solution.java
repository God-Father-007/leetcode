class Solution {
    
    public int[] numMovesStones(int a, int b, int c) {
        int[] ans = new int[2];
        int x = Math.min( a, Math.min( b,c ) );
        int z = Math.max( a, Math.max( b,c ) );
        int y = a+b+c-x-z;
        if( x+1 == y && y+1 == z ) { return ans; }
        else if( x+1 == y || y+1 == z || x+2 == y || y+2 == z ) { ans[0] = 1; }
        else { ans[0] = 2; }
        ans[1] = z-x-2;
        return ans;
    }
}
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        for( int i=0;i<jewels.length();i++ ) {
            if( stones.length() == 0 ) { break; }
            int preLen = stones.length();
            stones = stones.replaceAll( jewels.charAt(i)+"", "" );
            ans += preLen - stones.length();
        }
        return ans;
    }
}
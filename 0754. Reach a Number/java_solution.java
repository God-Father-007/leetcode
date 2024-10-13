class Solution {
    public int reachNumber(int target) {
        int step = 0, pos = 0, tar = Math.abs(target);
        while( true ) {
            if( pos == tar ) { break; }
            if( pos > tar && (pos-tar)%2 == 0 ) { break; }
            step++;
            pos += step;
        }
        return step;
    }
}
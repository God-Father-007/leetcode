class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if( bits.length == 1 ) { return true; }
        int i=0;
        while( i < bits.length ) {
            if( bits[i] == 1 ) {
                i += 2;
                if( i == bits.length - 1 ) { return true; }
            } else {
                i++;
                if( i == bits.length - 1 ) { return true; }
            }
        }
        return false;
    }
}
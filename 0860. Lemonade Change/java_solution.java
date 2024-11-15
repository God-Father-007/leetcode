class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for( int b : bills ) {
            if( b == 5 ) {
                five++;
            } else if( b == 10 ) {
                ten++;
                if( five == 0 ) { return false; }
                five--;
            } else {
                if( five == 0 ) { return false; }
                if( ten == 0 ) {
                    if( five < 3 ) { return false; }
                    five -= 3;
                } else {
                    ten--;
                    five--;
                }
            }
        }
        return true;
    }
}
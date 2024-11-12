class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if( hand.length % groupSize > 0 ) { return false; }
        Arrays.sort( hand );
        while( hand.length > 0 ) {
            int x = hand[0];
            Set<Integer> indices = new HashSet<>();
            indices.add(0);
            for( int i = 1; i < groupSize; i++ ) {
                x++;
                int idx = Arrays.binarySearch(hand, 1, hand.length, x);
                if( idx < 0 || indices.contains(idx) ) { return false; }
                indices.add(idx);
            }
            int[] temp = new int[ hand.length - groupSize ];
            for( int i = 0, j = 0; i < hand.length; i++ ) {
                if( indices.contains(i) ) { continue; }
                temp[j++] = hand[i];
            }
            hand = temp;
        }
        return true;
    }
}
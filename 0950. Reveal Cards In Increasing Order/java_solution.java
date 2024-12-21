class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for( int i = 0; i < n; i++ ) { q.add(deck[i]); deck[i] = 0; }
        boolean skip = false;
        for( int i = 0; q.size() > 0; i++ ) {
            if( i == deck.length ) { i = 0; }
            if( deck[i] > 0 ) { continue; }
            if( skip ) { skip = false; continue; }
            skip = true;
            deck[i] = q.poll();
        }
        return deck;
    }
}
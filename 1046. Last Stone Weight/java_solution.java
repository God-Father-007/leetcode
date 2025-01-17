class Solution {
    public int lastStoneWeight(int[] stones) {
        if( stones.length == 1 ) { return stones[0]; }
        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
        for( int stone : stones ) { pq.add(stone); }
        while( pq.size() > 1 ) {
            int a = pq.poll(), b = pq.poll();
            a = Math.abs( a-b );
            if( a > 0 ) { pq.add(a); }
        }
        if( pq.size() == 0 ) { return 0; }
        return pq.poll();
    }
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for( int n : nums ) {
            q.add( n );
            if( q.size() > k ) { q.remove(); }
        }
        return q.remove();
    }
}
class Solution {
    class Pair{
        int[] nums;
        double f;
        Pair( int a, int b ) {
            this.nums = new int[]{a, b};
            this.f = this.nums[0] * 1.0 / this.nums[1];
        }
    }
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Pair> q = new PriorityQueue<>( new Comparator<Pair>() {
            public int compare( Pair a, Pair b ) {
                return a.f > b.f ? -1 : ( a.f == b.f ? 0 : 1 ) ;
            }
        });
        for( int i = 0; i < arr.length; i++ ) {
            for( int j = i+1; j < arr.length; j++ ) {
                q.add( new Pair( arr[i], arr[j] ) );
                if( q.size() > k ) { q.poll(); }
            }
        }
        return q.poll().nums;
    }
}
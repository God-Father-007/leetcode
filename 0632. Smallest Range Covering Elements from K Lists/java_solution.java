class Solution {
    
    class trio implements Comparable<trio> {
        int v, i, j;
        trio( int v, int i, int j ) {
            this.v = v;
            this.i = i;
            this.j = j;
        }
        public int compareTo( trio o ) {
            return this.v - o.v;
        }
    }
    
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<trio> pq = new PriorityQueue<>();
        int k = nums.size();
        int max = Integer.MIN_VALUE;
        for( int i=0;i<k;i++ ) {
            int v = nums.get(i).get(0);
            max = Math.max(max,v);
            trio t = new trio(v,i,0);
            pq.add(t);
        }
        int[] ans = {1, Integer.MAX_VALUE};
        int gap = ans[1] - ans[0];
        while( pq.size() > 0 ) {
            trio t = pq.poll();
            int min = t.v;
            if( max - min < gap ) {
                ans[0] = min;
                ans[1] = max;
                gap = max - min;
            }
            if( t.j+1 == nums.get(t.i).size() ){
              break;  
            } else {
                int v = nums.get(t.i).get(t.j+1);
                max = Math.max(max,v);
                trio next = new trio( v, t.i, t.j+1 );
                pq.add(next);
            }
        }
        return ans;
    }
}
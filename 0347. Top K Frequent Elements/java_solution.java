class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        if(nums.length == 0 ) { return ans; }
        HashMap<Integer,Integer> h = new HashMap<>();
        for( int v : nums ) {
            h.put( v, h.getOrDefault(v,0)+1 );
        }
        PriorityQueue<Integer> p = new PriorityQueue<>( (a,b) -> h.get(a)-h.get(b) );
        for( int v : h.keySet() ) {
            p.add(v);
            if( p.size() > k ) { p.poll(); }
        }
        for( int i=0;p.size() > 0;i++ ) { ans[i] = p.poll(); }
        return ans;
    }
}
class Solution {

    Map<Integer,List<Integer>> m;

    public Solution(int[] nums) {
        this.m = new HashMap<>();
        for( int i=0; i<nums.length; i++ ) {
            if( !m.containsKey(nums[i]) ) { m.put( nums[i], new ArrayList<>() ); }
            List<Integer> l = m.get(nums[i]);
            l.add(i);
        }
    }
    
    public int pick(int target) {
        List<Integer> l = m.get(target);
        int x =  (int)Math.floor(Math.random()*l.size());
        return l.get(x);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
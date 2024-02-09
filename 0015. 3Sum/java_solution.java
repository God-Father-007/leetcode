class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort( nums );
        Set<List<Integer>> set = new HashSet<>();
        for( int i=0; i<nums.length-2; i++ ) {
            int p = i+1, q = nums.length-1;
            while( p < q ) {
                if( nums[p] + nums[q] == -nums[i] ) {
                    List<Integer> x = new ArrayList<>();
                    x.add( nums[i] );
                    x.add( nums[p] );
                    x.add( nums[q] );
                    set.add(x);
                    p++; q--;
                } else if( nums[p] + nums[q] > -nums[i] ) {
                    q--;
                } else {
                    p++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
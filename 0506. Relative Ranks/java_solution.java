class Solution {
    public String[] findRelativeRanks(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for( int i=0;i<nums.length;i++ ) { h.put( nums[i],i ); }
        Arrays.sort(nums);
        String[] ans = new String[nums.length];
        int rank = nums.length;
        for(int i=0;i<nums.length;i++) {
            if( rank == 3 ) { ans[h.get(nums[i])] = "Bronze Medal"; }
            else if( rank == 2 ) { ans[h.get(nums[i])] = "Silver Medal"; }
            else if( rank == 1 ) { ans[h.get(nums[i])] = "Gold Medal"; }
            else { ans[h.get(nums[i])] = rank+""; }
            rank--;
        }
        return ans;
    }
}
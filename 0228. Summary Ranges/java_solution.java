class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int count = 0, i = 0;
        while( i < nums.length ) {
            int j=i;
            count = nums[i];
            while( j < nums.length && count == nums[j] ) { j++; count++; }
            if( j-1 == i ) { ans.add( nums[i]+"" ); }
            else {
                ans.add( nums[i]+"->"+nums[j-1] );
            }
            i = j;
        }
        return ans;
    }
}
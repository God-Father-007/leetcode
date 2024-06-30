class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for( int i=1;i<=nums.length;i++ ) {
            if( Arrays.binarySearch(nums,i) < 0 ) { ans.add(i); }
        }
        return ans;
    }
}
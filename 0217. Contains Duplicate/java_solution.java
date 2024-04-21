class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        while(i+1 < nums.length) {
            while( i+1 < nums.length && nums[i+1] == nums[i] ) { return true; }
            i++;
        }
        return false;
    }
}
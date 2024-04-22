class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if( nums.length < 2 || k == 0 ) { return false; }
        int i=0;
        while(i < nums.length) {
            int j=i+1;
            while(j < i+k+1 && j < nums.length ) {
                if( nums[i] == nums[j] ) { return true; }
                j++;
            }
            i++;
        }
        return false;
    }
}
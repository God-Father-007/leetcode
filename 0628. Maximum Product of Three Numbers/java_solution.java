class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort( nums );
        int l = nums.length-1;
        int ans = nums[0]*nums[1]*nums[2];
        ans = Math.max( ans, nums[0]*nums[1]*nums[l] );
        ans = Math.max( ans, nums[0]*nums[l-1]*nums[l] );
        ans = Math.max( ans, nums[l-2]*nums[l-1]*nums[l] );
        return ans;
    }
}
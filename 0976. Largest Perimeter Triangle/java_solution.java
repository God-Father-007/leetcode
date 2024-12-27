class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for( int i=nums.length-1;i>1;i-- ) {
            int a = nums[i], b = nums[i-1], c = nums[i-2];
            if( a+b <= c || a+c <= b || b+c <= a ) { continue; }
            else { return a+b+c; }
        }
        return 0;
    }
}
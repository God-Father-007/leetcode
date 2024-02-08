class Solution {
    public int maxArea(int[] height) {
        int n = height.length, ans = 0;
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                ans = Math.max(ans, (j-i)*Math.min(height[i],height[j]) );
            }
        }
        return ans;
    }
}
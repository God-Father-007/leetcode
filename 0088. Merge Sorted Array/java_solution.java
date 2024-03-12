class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int l = 0, r = 0, i=0;
        while(l < m && r < n) {
            if(nums1[l] < nums2[r]) {
                ans[i] = nums1[l];
                l++;
            } else {
                ans[i] = nums2[r];
                r++;
            }
            i++;
        }
        while(l < m) {
            ans[i] = nums1[l];
            l++;
            i++;
        }
        while(r < n) {
            ans[i] = nums2[r];
            r++;
            i++;
        }
        for(i=0;i<ans.length;i++) {
            nums1[i] = ans[i];
        }
    }
}
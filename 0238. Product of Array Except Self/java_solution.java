class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, postfixProd = 1;
        int[] prefixProd = new int[n];
        prefixProd[0] = nums[0];
        for( int i = 1; i < n; i++ ) { prefixProd[i] = prefixProd[i-1] * nums[i]; }
        for( int i = n-1; i >= 0; i-- ) {
            prefixProd[i] = ( i == 0 ? 1 : prefixProd[i-1]) * postfixProd;
            postfixProd *= nums[i];
        }
        return prefixProd;
    }
}
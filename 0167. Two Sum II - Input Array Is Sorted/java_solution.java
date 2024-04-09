class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = {1,1};
        for(int i=0;i<numbers.length;i++) {
            if( target-numbers[i] == numbers[i] ) {
                if( i>0 && numbers[i] == numbers[i-1] ) {
                    ans[0] += i-1;
                    ans[1] += i;
                    return ans;
                }
                if( i<numbers.length-1 && numbers[i] == numbers[i+1] ) {
                    ans[0] += i;
                    ans[1] += i+1;
                    return ans;
                }
            }
            int j = Arrays.binarySearch(numbers,target-numbers[i]);
            if( j>=0 ) {
                ans[0] += Math.min(i,j);
                ans[1] += Math.max(i,j);
                return ans;
            }
        }
        return ans;
    }
}
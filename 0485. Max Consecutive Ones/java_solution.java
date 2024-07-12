class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        String s = "";
        for(int i=0;i<nums.length;i++) {
            s += nums[i]+"";
        }
        String[] str = s.split("0");
        if(str.length == 0) {return 0;}
        int max = Integer.MIN_VALUE;
        for(int i=0;i<str.length;i++) {
            max = Math.max(max,str[i].length());
        }
        return max;
    }
}
import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == val) {continue;}
            al.add(nums[i]);
        }
        Collections.reverse(al);
        int i=0, ans = al.size();
        while(al.size() > 0) {
            nums[i] = al.remove(al.size()-1);
            i++;
        }
        return ans;
    }
}
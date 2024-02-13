class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {return 0;}
        ArrayList<Integer> al = new ArrayList<>();
        int temp = nums[0];
        al.add(temp);
        for(int i=1;i<nums.length;i++) {
            if(nums[i] == temp) {continue;}
            temp = nums[i];
            al.add(temp);
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
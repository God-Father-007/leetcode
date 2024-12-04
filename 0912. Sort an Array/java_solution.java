class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for( int n : nums ) { q.add(n); }
        for( int i = 0; q.size() > 0; i++ ) { nums[i] = q.remove(); }
        return nums;
    }
}
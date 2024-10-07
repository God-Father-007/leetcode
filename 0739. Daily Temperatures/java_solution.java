class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];
        for( n = --n; n >= 0; n-- ) {
            while( s.size() > 0 && temperatures[s.peek()] <= temperatures[n] ) {
                s.pop();
            }
            ans[n] = s.size() == 0 ? 0 : s.peek() - n ;
            s.push(n);
        }
        return ans;
    }
}
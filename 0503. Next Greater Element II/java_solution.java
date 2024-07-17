class Solution {
    public int[] nextGreaterElements(int[] nums) {
        if( nums.length == 0 ) { return new int[0]; }
        int[] ans = new int[nums.length];
        Arrays.fill( ans, Integer.MIN_VALUE );
        int numberOfNegativeOnes = ans.length, count = 2*ans.length;
        Stack<Integer> s = new Stack<>();
        int i = nums.length-1;
        s.push( nums[i] );
        i--;
        while( count > 2 ) {
            if( i < 0 ) { i = ans.length-1;}
            if( ans[i] != Integer.MIN_VALUE ) { i--; continue; }
            while( s.size() > 0 && s.peek() <= nums[i] ) { s.pop(); }
            if( s.size() > 0 ) { ans[i] = s.peek(); }
            s.push(nums[i]);
            i--;
            count--;
        }
        
        for( i=0;i<ans.length;i++ ) {
            if( ans[i] == Integer.MIN_VALUE ) { ans[i] = -1; }
        }
        
        return ans;
        
    }
}
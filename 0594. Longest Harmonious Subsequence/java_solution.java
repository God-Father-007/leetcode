class Solution {
    public int findLHS(int[] nums) {
        int l = 0;
        for( int i=0;i<nums.length-1;i++ ) {
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            boolean a_flag = false, b_flag = false;
            a.add( nums[i] );
            b.add( nums[i] );
            for( int j=i+1;j<nums.length;j++ ) {
                int x = nums[i]-nums[j];
                if( x == 0 || x == 1 ) { a.add( nums[j] ); }
                if( x == 1 ) { a_flag = true; }
                if( x == 0 || x == -1 ) { b.add( nums[j] ); }
                if( x == -1 ) { b_flag = true; }
            }
            if( a_flag ) { l = Math.max( l,a.size() ); }
            if( b_flag ) { l = Math.max( l,b.size() ); }
        }
        return l;
    }
}
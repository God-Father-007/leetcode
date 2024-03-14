class Solution {
    public List<Integer> grayCode(int n) {
        int limit = (int)Math.pow(2, n);
     	 ArrayList<Integer> ans = new ArrayList<>();
     	 for( int i=0;i<limit;i++ ) {
     	     ans.add( (i>>1)^i );
     	 }
     	 return ans;
    }
}
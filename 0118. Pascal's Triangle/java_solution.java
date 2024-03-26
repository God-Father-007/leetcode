class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if( numRows == 0 ) { return ans; }
        for(int i=1;i<=numRows;i++) {
            List<Integer> t = new ArrayList<>();
            if( i == 1 ) {
                t.add(1);
                ans.add(t);
                continue;
            }
            t.add(1);
            for(int j=0;j<ans.get(i-2).size()-1;j++) {
                t.add(ans.get(i-2).get(j)+ans.get(i-2).get(j+1));
            }
            t.add(1);
            ans.add(t);
        }
        return ans;
    }
}
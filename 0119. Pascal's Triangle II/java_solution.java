class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long lastAdded = 1;
        ans.add((int)lastAdded);
        for( int r = 0; r < rowIndex; r++ ) {
            lastAdded = ((rowIndex-r)*lastAdded)/(r+1);
            ans.add( (int)lastAdded );
        }
        return ans;
    }
}
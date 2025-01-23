class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int n = num_people;
        int layer = 0, layerSum = (n*(n+1))/2;
        while( layerSum <= candies ) {
            layer++;
            candies -= layerSum;
            layerSum += n*n;
        }
        int CriticalIdx = 0;
        for( int i=0;i<num_people;i++ ) {
            layerSum -= (layer+1)*n-i;
            if( layerSum <= candies ) {
                candies -= layerSum;
                CriticalIdx = num_people-1-i;
                break;
            }
        }
        int[] ans = new int[num_people];
        for( int i=0;i<ans.length;i++ ) {
            int k = layer;
            if( i < CriticalIdx ) { k++; }
            ans[i] = (i+1)*k + (n*k*(k-1))/2 ;
        }
        ans[CriticalIdx] += candies;
        return ans;
    }
}
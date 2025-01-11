class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ans = new int[rows*cols][2];
        int r = 1, count = 1;
        ans[0][0] = rCenter;
        ans[0][1] = cCenter;
        while( count < ans.length ) {
            int i = rCenter - r, j = cCenter;
            while( i < rCenter ) {
                if( i >= 0 && i < rows && j >= 0 && j < cols ) {
                    ans[count][0] = i;
                    ans[count][1] = j;
                    count++;
                }
                i++;
                j++;
            }
            while( j > cCenter ) {
                if( i >= 0 && i < rows && j >= 0 && j < cols ) {
                    ans[count][0] = i;
                    ans[count][1] = j;
                    count++;
                }
                i++;
                j--;
            }
            while( i > rCenter ) {
                if( i >= 0 && i < rows && j >= 0 && j < cols ) {
                    ans[count][0] = i;
                    ans[count][1] = j;
                    count++;
                }
                i--;
                j--;
            }
            while( j < cCenter ) {
                if( i >= 0 && i < rows && j >= 0 && j < cols ) {
                    ans[count][0] = i;
                    ans[count][1] = j;
                    count++;
                }
                i--;
                j++;
            }
            r++;
        }
        return ans;
    }
}
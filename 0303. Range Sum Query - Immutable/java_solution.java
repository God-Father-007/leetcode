class NumArray {
    int[] a;
        public NumArray(int[] nums) {
            a = nums;
        }
        
        public int sumRange(int i, int j) {
            int sum = 0;
            while( i<j ) { sum += a[i]+a[j]; i++; j--; }
            if( i == j ) { sum += a[i]; }
            return sum;
        }
    }
    
    /**
     * Your NumArray object will be instantiated and called as such:
     * NumArray obj = new NumArray(nums);
     * int param_1 = obj.sumRange(i,j);
     */
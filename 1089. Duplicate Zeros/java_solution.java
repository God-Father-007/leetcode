class Solution {
    
    public static void insert(int[] arr, int i) {
        int j = arr.length-1;
        while(j > i+1) {
           arr[j] = arr[j-1]; 
            j--;
        }
        arr[j] = 0;
    }
    
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 0) {insert(arr,i); i++;}
        }
    }
}
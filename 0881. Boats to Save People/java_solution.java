class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort( people );
        int i = 0, j = people.length-1, boats = 0;
        while( i < j ) {
            int w = people[i] + people[j];
            if( w <= limit ) { i++; } 
            j--;
            boats++;
        }
        if( i == j ) { boats++; }
        return boats;
    }
}
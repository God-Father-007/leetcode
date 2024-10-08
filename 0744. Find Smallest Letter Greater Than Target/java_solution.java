class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i = Arrays.binarySearch(letters, target);
        if( i < 0 ) {
            i = Math.abs(i+1)%letters.length;
        } else {
            while( i+1 < letters.length && letters[i] == letters[i+1] ) { i++; }
            i = (i+1)%letters.length;
        }
        return letters[i];
    }
}
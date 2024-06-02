class Solution {
    public boolean isPerfectSquare(int num) {
        int i = (int)Math.floor(Math.sqrt(num));
        return num == i*i;
    }
}
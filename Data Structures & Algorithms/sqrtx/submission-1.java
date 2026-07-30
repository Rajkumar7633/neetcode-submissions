class Solution {
    public int mySqrt(int x) {
        int an = 0;
        for(long i =1;i * i <= x;i++){
            an = (int) i;
        }
        return an;
    }
}
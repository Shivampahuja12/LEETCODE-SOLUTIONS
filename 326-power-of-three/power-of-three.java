class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        while (n != 1){
            if (n%3==1 || n%3==2) return false;
            n/=3;
        }
        return true;
    }
}
class Solution {
    public int countDigits(int num) {
        int n = num;
        int c = 0;
        while (n > 0) {
            if (num % (n % 10) == 0)
                c++;
            n /= 10;
        }
        return c;
    }
}
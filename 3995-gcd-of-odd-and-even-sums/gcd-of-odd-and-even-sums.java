class Solution {
    public int gcdOfOddEvenSums(int n) {
        long sumOdd = n * n;
        long sumEven = n * n + n;
        return gcd(sumOdd, sumEven);
    }

    public int gcd(long a, long b) {
        if (b == 0) return (int) a;
        return gcd(b, a % b);
    }
}
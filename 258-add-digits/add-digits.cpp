class Solution {
public:
    // brute force
    int recurse(int n, int sum) {
        for (int i = n; i > 0; i = i / 10) {
            sum += i % 10;
        }
        return sum;
    }
    int addDigits(int n) {
        static int sum = 0;
        while (n >= 10) {
            n = recurse(n, sum);
        }
        return n;
    }
};
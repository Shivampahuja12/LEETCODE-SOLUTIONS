class Solution {
public:
    int fib(int n) {
        // recursion.
        /* if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2); */
        int f0 = 0;
        int f1 = 1;
        int f = 0;
        for (int i = 1; i <= n; i++) {
            f0 = f1;
            f1 = f;
            f = f0 + f1;
        }
        return f;
    }
};
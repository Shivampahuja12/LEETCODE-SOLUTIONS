class Solution {
    public double myPow(double x, int n) {
        if (n<0) {
            double y = ans(x, -n);
            return 1/y;
        }
        else {
            double y = ans(x, n);
            return y;
        }
    }

    public double ans(double x, int n){
        if (n==0) return 1;
        // if (n>0){
        //     return x * ans(x, n-1);
        // }
        // else {
        //     return x * ans(x, n+1);
        // }
        double ans1 = ans(x, n / 2);

        if (n % 2 == 0) {
            return ans1 * ans1;
        } else {
            return x * ans1 * ans1;
        }
    }
}
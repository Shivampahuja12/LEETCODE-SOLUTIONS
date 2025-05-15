int mySqrt(int x) {
    int lo = 0, hi = (x / 2) + 1;
    long long int mid;
    int ans = 0;
    while (lo <= hi) {
        mid = lo + (hi - lo) / 2;
        if (mid * mid == x) {
            return mid;
            break;
        }
        if (mid * mid < x){
            ans = mid;
            lo = mid + 1;
        }
        if (mid * mid > x)
            hi = mid - 1;
    }
    return ans;
}
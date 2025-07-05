class Solution {
public:
    bool isPerfectSquare(int num) {
        if (num == 1 || num == 0) return true;
        int target = num;
        int lo = 0;
        int hi = num;
        long long int mid;
        while (lo<=hi){
            mid = lo + (hi - lo)/2;
            long long int midVal =  mid*mid;

            if (midVal == target) {
                return true;
            }
            if (midVal > target){
                hi = mid -1;
            }
            if (midVal < target){
                lo = mid + 1;
            }
        }
        return false;
    }
};
class Solution {
public:
    bool isArraySpecial(vector<int>& a) {
        int n = a.size();
        bool flag = true;
        if (n == 1)
            return true;
        for (int i = 0; i < n - 1; i++) {
            if (!(a[i] != a[i + 1] && ((a[i] % 2 == 0 && a[i + 1] % 2 != 0) ||
                                       (a[i] % 2 != 0 && a[i + 1] % 2 == 0)))) {
                flag = false;
            }
        }
        return flag;
    }
};
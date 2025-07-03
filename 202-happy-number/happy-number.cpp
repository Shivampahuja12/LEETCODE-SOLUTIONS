class Solution {
public:
    vector<int> makeVec(int n) {
        vector<int> v;
        for (int i = n; i > 0; i = i / 10) {
            v.push_back(i % 10);
        }
        return v;
    }

    long long int digitSum(vector<int> v) {
        long long int sum = 0;

        for (int i = 0; i < v.size(); i++) {
            long long int sq = v[i] * v[i];
            sum = sum + sq;
        }
        return sum;
    }

    bool isHappy(int n) {

        vector<int> v = makeVec(n);
        int func = digitSum(v);

        // while (func < INT_MAX) {
        //     vector<int> kuchBhi = makeVec(func);
        //     func = digitSum(kuchBhi);
        //     if (func == 1) return true;
        // }
        // return false;

        while (func != 1 && func != 4) {  // 4 is the entry point of the unhappy cycle
            vector<int> kuchBhi = makeVec(func);
            func = digitSum(kuchBhi);
        }
        return func == 1;
    }
};
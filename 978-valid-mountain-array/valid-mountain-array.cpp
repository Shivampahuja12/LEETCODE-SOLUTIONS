class Solution {
public:
    bool validMountainArray(vector<int>& a) {
        int n = a.size();
        int idx = -1;
        for (int i=1; i<n-1; i++){
            if (a[i] > a[i+1] && a[i] > a[i-1]) idx = i;
        }
        if (idx == -1) return false;
        for (int i=0; i<idx; i++){
            if ((a[i] >= a[i+1])) {
                return false;
            }
        }
        for (int i=idx; i<n-1; i++){
            if ((a[i] <= a[i+1])){
                return false;
            }
        }
    return true;
    }
};
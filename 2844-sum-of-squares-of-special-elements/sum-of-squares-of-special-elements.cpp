class Solution {
public:
    // NS
    int sumOfSquares(vector<int>& v) {
        int sum = 0;
        int n = v.size();
        for (int i=0; i<v.size(); i++){
            int idx = i+1;
            if (n%idx==0){
                sum += v[i]*v[i];
            }
        }
        return sum;
    }
};
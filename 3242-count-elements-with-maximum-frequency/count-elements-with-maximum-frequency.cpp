class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        int freq[101] = {0};
    for (int i=0; i<nums.size(); i++){
        freq[nums[i]]++;
    }
    int sum = 0;
    int max = 0;
    for (int i=0; i<101; i++){
        if (freq[i] > max) {
            max = freq[i];
            sum = max;
            // printf("%d", sum);
        }
        else if (freq[i] == max){
            sum += freq[i];
        }
    }
    return sum;
    }
};
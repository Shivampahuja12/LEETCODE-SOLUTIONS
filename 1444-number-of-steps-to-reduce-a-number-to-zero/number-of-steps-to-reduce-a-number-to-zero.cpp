class Solution {
public:
    int numberOfSteps(int num) {
        return helper(num, 0);
    }

    int helper(int n, int count){
        if (n==0) return count;

        if (n%2==0){
            n=n/2;
            count++;
        }
        else if (n%2!=0){
            n=n-1;
            count++;
        }

        return helper(n, count);
    }
};
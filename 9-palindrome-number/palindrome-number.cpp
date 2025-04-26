class Solution {
public:
    bool isPalindrome(int x) {
        long int n, pal = 0;
        n = x;
        do {
            pal = pal *10 + x%10;
        } while (x/=10);
        if (abs(pal) == n) return true;
        else return false;
    }
};
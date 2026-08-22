class Solution {
    public boolean checkDivisibility(int n) {
        // sum & product in one go
        int sum = 0;
        int prod = 1;
        int num = n;
        while (num > 0) {
            sum += num % 10;
            prod *= num % 10;
            num /= 10;
        }

        // check
        if (n % (sum + prod) == 0)
            return true;
        return false;
    }
}
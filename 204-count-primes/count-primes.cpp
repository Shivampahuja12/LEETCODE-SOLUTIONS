class Solution {
public:
    /* bool isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++) { // i*i <= n
            if (n % i == 0)
                return false;
        }
        return true;
    } */
    int countPrimes(int n) {
        /*
        // naive approach
        int count = 0;
        for (int i=0; i<n; i++){
            if (isPrime(i)){
                count++;
            }
        }
        return count; */


        // Sieve of Eratosthenes  
        if (n==0 || n==1) return false;
        vector<bool> prime(n, true);
        prime[0] = false;
        prime[1] = false;
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                count++;
                int j = 2 * i;
                while (j < n) {
                    prime[j] = false;
                    j += i;
                }
            }
        }
        return count;
    }
};
class Solution {
    public boolean checkDivisibility(int n) {
        // sum
        int sum = 0;
        int num = n;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        // product
        int prod = 1;
        num = n;
        while (num > 0) {
            prod *= num % 10;
            num /= 10;
        }
        System.out.println(sum);
        System.out.println(prod);

        // check
        if (n % (sum + prod) == 0)
            return true;
        return false;
    }
}
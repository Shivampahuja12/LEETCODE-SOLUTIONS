class Solution {
    public int[] plusOne(int[] digits) {
        /* int ans = 0;
        for (int i=0; i<digits.length; i++){
            ans = ans * 10 + digits[i];
        }
        ans += 1;

        int len = 0;
        for (int i=ans; i>0; i=i/10){
            len++;
        }

        int[] result = new int[len];
        for (int i=0; i<digits.length; i++){
            int res = (int)ans/(int)Math.pow(10, len-i-1);
            if (ans > 9){
                result[i] = res%10;
            }
            else {
                result[i] = res;
            }
        }

        return result; */


        int n = digits.length;
        for (int i=n-1; i>=0; i--){
            if (digits[i] < 9){
                digits[i]+=1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[n+1];
        result[0] = 1;
        return result;

    }
}
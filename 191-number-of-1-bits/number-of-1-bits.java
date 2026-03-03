class Solution {
    public int hammingWeight(int n) {
        int cnt = 0;
        int i = 0;
        while (n > 0){
            if (((n << i) & 1) == 1) cnt++;
            n/=2;
        }
        return cnt;
    }
}
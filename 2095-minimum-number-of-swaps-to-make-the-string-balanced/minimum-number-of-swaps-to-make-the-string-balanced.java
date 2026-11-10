class Solution {
    public int minSwaps(String s) {
        int imbalance = 0;
        int maxImbalance = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                imbalance--;
            } else {
                imbalance++;
            }

            maxImbalance = Math.max(maxImbalance, imbalance);
        }

        return (maxImbalance + 1) / 2;
    }
}
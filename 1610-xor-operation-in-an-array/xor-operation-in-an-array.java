class Solution {
    public int xorOperation(int n, int start) {

        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = start + 2 * i;
        }

        int xori = 0;
        for (int i=0; i<n; i++){
            xori ^= a[i];
        }

        return xori;
    }
}
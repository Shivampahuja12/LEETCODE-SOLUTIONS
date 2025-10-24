class Solution {
    public int xorOperation(int n, int start) {


        /* // brute force
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = start + 2 * i;
        }

        int xori = 0;
        for (int i=0; i<n; i++){
            xori ^= a[i];
        }

        return xori; */


        // better (not using extra space)
        int res = start;
        for (int i=1; i<n; i++){
            res ^= start + 2 * i;
        }

        return res;
    }
}
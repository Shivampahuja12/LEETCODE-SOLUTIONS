    int kthFactor(int n, int k) {
        int a[33];
        int m = 0;
        for (int i=1; i<=n; i++){
            if (n%i==0) {
                a[m++] = i;
            }
        }
        if (m<k) return -1;
        else return a[k-1];
    }
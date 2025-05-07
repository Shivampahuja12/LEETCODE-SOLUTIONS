int maxProduct(int n) {
    int a[20];
    int k = 0;
    for (int i=n; i>0; i=i/10){
        a[k++] = i%10;
    }
    for (int i=0; i<k; i++){
        for (int j=i+1; j<k; j++){
            if (a[i] > a[j]){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    return a[k-1]*a[k-2];
}
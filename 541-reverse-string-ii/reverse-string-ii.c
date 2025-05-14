void swap(char *s, int i, int j){
    while (i<j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        i++;
        j--;
    }
}
char* reverseStr(char* s, int k) {
    if (k==0) return s;
    int n;
    for (n=0; s[n]!='\0'; n++){}
    if (k>n) {
        swap(s, 0, n-1);
        return s;
    }
    if (n<=1) return s;
    int i = 0;
    while (i + k - 1 < n){
        swap(s, i, i + k - 1);
        i += 2 * k;
    }
    
    if (i < n){
        swap(s, i, n - 1);
    }

    return s;
}
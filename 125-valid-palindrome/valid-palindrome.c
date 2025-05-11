bool isPalindrome(char* s) {
    int m;
    for (m=0; s[m]!=0; m++){}
    char main[m+1];
    int k = 0;
    for (int i = 0; s[i] != '\0'; i++) {
        if (isalnum(s[i])) {
            if (isupper(s[i])) {
                main[k++] = tolower(s[i]);
            }
            else main[k++] = s[i];
        }
    }
    main[k] = '\0';
    int lo = 0 , hi = k-1;
    bool flag = true;
    while (lo < hi){
        if (main[lo] != main[hi]){
            flag = false;
            break;
        }
        lo++, hi--;
    }
    if (flag == false) return false;
    else return true;
}
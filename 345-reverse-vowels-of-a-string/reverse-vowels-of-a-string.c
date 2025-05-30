char* reverseVowels(char* s) {
    int n = strlen(s);
    char* vowel = (char*)malloc(n * sizeof(char));
    int k = 0;
    for (int i = 0; s[i]!='\0'; i++) {
        if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' ||
            s[i] == 'u' || s[i] == 'A' || s[i] == 'E' || s[i] == 'I' ||
            s[i] == 'O' || s[i] == 'U') {
            vowel[k++] = s[i];
        }
    }

    for (int i=0, j=k - 1; i<=j; i++, j--){
        char temp = vowel[i];
        vowel[i] = vowel[j];
        vowel[j] = temp;
    }

    int r = 0;
    for (int i = 0; s[i]!='\0'; i++) {
        if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' ||
            s[i] == 'u' || s[i] == 'A' || s[i] == 'E' || s[i] == 'I' ||
            s[i] == 'O' || s[i] == 'U') {
            s[i] = vowel[r++];
        }
    }
    return s;
}
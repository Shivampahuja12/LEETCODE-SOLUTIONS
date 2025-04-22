void reverseString(char* s, int sSize) {
    // using character array...
    int i;
    int start = 0;
    int end = sSize-1;
    while (start < end) {
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        start++;
        end--;
    }
}
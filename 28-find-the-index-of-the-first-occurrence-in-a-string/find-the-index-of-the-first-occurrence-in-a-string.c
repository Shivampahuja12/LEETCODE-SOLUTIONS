int strStr(char* haystack, char* needle) {
    // int *r = -1;
    char *r = strstr(haystack, needle);
    if (r != NULL) {
        int s = r - haystack;
        return s;
    }
    else return -1;
}
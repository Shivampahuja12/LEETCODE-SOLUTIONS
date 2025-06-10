int maxDifference(char* s) {
    // if (strlen(s) <= 2)
    //     return false;
    // int freq[1001] = {0};
    // for (int i = 0; s[i] != '\0'; i++) {
    //     freq[s[i]]++;
    // }
    // // int odd = 0;
    // // int even = 0;
    // int maxEven = -1;
    // int maxOdd = -1;
    // for (int i = 0; i < 1001; i++) {
    //     if (freq[i] > maxEven && freq[i] % 2 == 0) {
    //         maxEven = freq[i];
    //     }
    //     if (freq[i] > maxOdd && freq[i] % 2 != 0) {
    //         maxOdd = freq[i];
    //     }
    // }
    // if (maxEven == -1 || maxOdd == -1)
    //     return 0; // handle case with no valid even/odd

    // return maxOdd - maxEven;
    size_t len = strlen(s);
    if (len <= 2)
        return 0;

    int freq[256] = {0};
    for (size_t i = 0; i < len; i++) {
        unsigned char c = (unsigned char)s[i];
        freq[c]++;
    }

    int maxOdd = -1;
    int minEven = INT_MAX;
    for (int i = 0; i < 256; i++) {
        if (freq[i] > 0) {
            if (freq[i] % 2 == 1 && freq[i] > maxOdd) {
                maxOdd = freq[i];
            } else if (freq[i] % 2 == 0 && freq[i] < minEven) {
                minEven = freq[i];
            }
        }
    }

    if (maxOdd == -1 || minEven == INT_MAX)
        return 0;

    return maxOdd - minEven;
}
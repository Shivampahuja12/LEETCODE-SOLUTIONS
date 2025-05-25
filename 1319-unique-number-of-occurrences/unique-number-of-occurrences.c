bool uniqueOccurrences(int* arr, int arrSize) {
    int freq[2001] = {0};

    for (int i = 0; i < arrSize; i++) {
        freq[arr[i] + 1000]++;
    }

    int freq2[2001] = {0};
    for (int i = 0; i < 2001; i++) {
        if (freq[i] > 0) {
            if (freq2[freq[i]] > 0)
                return false;
            freq2[freq[i]] = 1;
        }
    }
    return true;
}
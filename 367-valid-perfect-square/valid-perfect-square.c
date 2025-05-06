bool isPerfectSquare(int num) {
    if (num <= INT_MAX && num >= INT_MIN) {
        long long int i;
        for (i = 0; i <= (num / 2) + 1; i++) {
            if (i * i == num)
                return true;
        }
    }
    return false;
}
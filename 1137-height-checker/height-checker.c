int heightChecker(int* heights, int heightsSize) {
    
    int a[heightsSize];

    for (int i=0; i<heightsSize; i++){
        a[i] = heights[i];
    }

    for (int i=0; i<heightsSize; i++){
        for (int j=i+1; j<heightsSize; j++){
            if (a[i] > a[j]){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }

    int count = 0;

    for (int i=0; i<heightsSize; i++){
        if (a[i] != heights[i]){
            count++;
        }
    }

    return count;
}
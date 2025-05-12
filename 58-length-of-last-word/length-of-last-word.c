int lengthOfLastWord(char* s) {
    char *token = strtok(s, " ");
    char *last = NULL;
    while (token!=NULL){
        last = token;
        token = strtok(NULL, " ");
    }
    if (last) return strlen(last);
    else return 0;
}
class Solution {
    public boolean detectCapitalUse(String word) {
        // if (word.isUpperCase()){
        //     return true;
        // }
        // else if (word.isLowerCase()){
        //     return true;
        // }
        // else if (Character.isUpperCase(word.charAt(0)) && word.substring(1).isLowerCase()){
        //     return true;
        // }

        // return false;

        int count = 0;
        boolean flag = false;
        if (Character.isUpperCase(word.charAt(0))) {
            flag = true;
        }
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }

        if (count == word.length()) return true;
        else if (flag && count == 1) return true;
        else if (count == 0) return true;
        else return false;
    }
}
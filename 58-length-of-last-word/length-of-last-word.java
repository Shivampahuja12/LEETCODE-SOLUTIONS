class Solution {
    public int lengthOfLastWord(String s) {

        if(s.trim().length() == 1) return 1;

        int index = -1;
        for (int i=s.length()-1; i>=0; i--){
            if (Character.isLetter(s.charAt(i))){
                index = i;
                break;
            }
        }
        
        int count = 0;
        int i = index;
        while ( i >= 0 && s.charAt(i) != ' '){
            count++;
            i--;
        }

        return count;
    }
}
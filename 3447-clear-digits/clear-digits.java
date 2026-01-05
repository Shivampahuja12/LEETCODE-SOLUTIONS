class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            if (!(s.charAt(i) >= 48 && s.charAt(i) <= 57)){
                st.push(s.charAt(i));
            }
            else {
                st.pop();
            }
        }

        while (!st.isEmpty()){
            sb.append(st.pop());
        }

        sb.reverse();

        return sb.toString();

    }
}
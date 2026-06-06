class Solution {
    public boolean rotateString(String s, String goal) {
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sbdr = new StringBuilder();
            sbdr.append(s.substring(1) + s.charAt(0));
            s = sbdr.toString();
            if (sbdr.toString().equals(goal))
                return true;
        }
        return false;
    }
}
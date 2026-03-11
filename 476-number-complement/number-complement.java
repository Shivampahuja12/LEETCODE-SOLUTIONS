class Solution {
    public int findComplement(int num) {
        if (num == 0) return 1;
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(num & (1<<0));
            num >>= 1;
        }
        for (int i=0; i<sb.length(); i++){
            if (sb.charAt(i) == '0'){
                sb.setCharAt(i, '1');
            }
            else if (sb.charAt(i) == '1'){
                sb.setCharAt(i, '0');
            }
        }

        sb.reverse();
        System.out.println(sb);
        return Integer.parseInt(sb.toString(), 2);
    }
}
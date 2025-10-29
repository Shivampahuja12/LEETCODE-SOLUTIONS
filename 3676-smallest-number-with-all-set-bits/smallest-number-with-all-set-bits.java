class Solution {
    public int smallestNumber(int n) {
        StringBuilder sb = new StringBuilder();

        while (n != 0){
            sb.append(n%2);
            n/=2;
        }

        System.out.println(sb.length());

        int ans = 0;
        for (int i=0; i<sb.length(); i++){
            ans = ans * 10 + 1;
        }

        System.out.println(ans);

        int main = 0;
        int icc = 0;
        for (int i=0; i<sb.length(); i++){
            main = main + (int) (ans % 10 * Math.pow(2, icc++)); 
        }

        System.out.println(main);
        return main;
    }
}
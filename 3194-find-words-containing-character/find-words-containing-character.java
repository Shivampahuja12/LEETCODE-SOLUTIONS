class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int vals = 0;
        for (String word: words){
            if (word.contains(String.valueOf(x))){
                list.add(vals);
            }
            vals++;
        }

        return list;
    }
}
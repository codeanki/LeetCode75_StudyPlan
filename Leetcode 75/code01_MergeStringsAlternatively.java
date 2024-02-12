class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1 == null){
            return word2;
        }
        if(word2 == null){
            return word1;
        }
        int maxlength = Math.max(word1.length(), word2.length());
        StringBuilder merged = new StringBuilder();
        for(int i = 0; i < maxlength; i++){
            if(i < word1.length()){
                merged.append(word1.charAt(i));
            }
            if(i < word2.length()){
                merged.append(word2.charAt(i));
            }
        }
        return merged.toString();
    }
}
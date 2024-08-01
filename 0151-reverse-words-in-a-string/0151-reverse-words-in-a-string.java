class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\s+");
        String reversedWords = "";
        for (int i = words.length - 1; i >=0; i--) {
        
            if (i > 0) {
                reversedWords = reversedWords + words[i] + " ";
            }
            else {
                reversedWords = reversedWords + words[i];
            }
            
        }
        return reversedWords;
        
    }
}
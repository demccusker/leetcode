class Solution {
    public String mergeAlternately(String word1, String word2) {
        String newString = "";
        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                newString = newString + String.valueOf(word1.charAt(i));
                newString = newString + String.valueOf(word2.charAt(i));
            }
        }
        if (word1.length() > word2.length()) {
            for (int i = 0; i < word2.length(); i++) {
                newString = newString + String.valueOf(word1.charAt(i));
                newString = newString + String.valueOf(word2.charAt(i));
            }
            newString = newString + word1.substring(word2.length());

        }
        if (word1.length() < word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                newString = newString + String.valueOf(word1.charAt(i));
                newString = newString + String.valueOf(word2.charAt(i));
            }
            newString = newString + word2.substring(word1.length());

        }
        
        return newString;
        
    }
}
class Solution {
    public String restoreString(String s, int[] indices) {
        
        char[] charArray = s.toCharArray();
        char[] newStringArray = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            newStringArray[indices[i]] = charArray[i];
        }
        String newString = "";
        for (char letter : newStringArray) {
            newString = newString + letter;
        }

        return newString;
    }
}
class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String[] splitS = s.split(" ");
        for (String string: splitS) {
            for (int i = string.length() -1; i>= 0; i--){
                str.append(string.charAt(i));
            }
            str.append(" ");
        }
        String reversedString = str.toString();
        reversedString = reversedString.trim();
        return reversedString;
    }
}
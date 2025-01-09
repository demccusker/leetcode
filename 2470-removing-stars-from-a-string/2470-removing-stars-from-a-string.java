class Solution {
    public String removeStars(String s) {
        StringBuilder stack = new StringBuilder();
        for ( char c : s.toCharArray()){
            if (stack.length() > 0 &&
            c == '*'){
                stack.deleteCharAt(stack.length()-1);
            }
            else{
                stack.append(c);
            }
        }
        return stack.toString();
    }
}
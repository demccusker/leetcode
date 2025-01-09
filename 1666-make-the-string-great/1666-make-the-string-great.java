class Solution {
    public String makeGood(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()){
            
            if(stack.length() > 0 && 
                   Character.toLowerCase(c)==(Character.toLowerCase(stack.charAt(stack.length() - 1))) &&
                   Character.isUpperCase(stack.charAt(stack.length() - 1))!= Character.isUpperCase(c)){
                stack.deleteCharAt(stack.length() - 1);
                
            }
            else {stack.append(c);}
        }
        return stack.toString(); 
        
    }
}
class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder();
        int right = s.length() - 1;
        for (int left = 0; left < s.length(); left++){
            if (Character.isLetter(s.charAt(left))){
                while (!Character.isLetter(s.charAt(right))){
                    right--;
                
                }
                sb.append(String.valueOf(s.charAt(right)));
                right--;
                
                
             }
            else {
                sb.append(String.valueOf(s.charAt(left)));
                
            }
            
            
            

        }
        
        // int right = s.length() - 1;
        // for (int left = 0; left < s.length(); left++ ){
        //     if (Character.isLetter(s.charAt(left))){
        //         sb.replace(right,right+1,String.valueOf(s.charAt(left)));
        //         right--;
                
        //     }
        //     else if (Character.isLetter(s.charAt(left))){
        //         right = right - 2;
        //     }
            

            
        // }
        String str = sb.toString();
        return str;
    }
}
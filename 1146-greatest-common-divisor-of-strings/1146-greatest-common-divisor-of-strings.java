class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String gcd = "";
        if (str1.length() > str2.length()) {
            for (int i = 1; i <= str2.length(); i++) {
                String substr = str2.substring(0,i);
                String checkString1 = "";
                while (checkString1.length() < str1.length()){
                    checkString1 = checkString1 + substr;
                }
                String checkString2 = "";
                while (checkString2.length() < str2.length()) {
                    checkString2 = checkString2 + substr;
                }
                if (checkString1.equals(str1) && checkString2.equals(str2)) {
                    gcd = substr;
                }

            }

        }
        else  {
            for (int i = 1; i <= str1.length(); i++) {
                String substr = str1.substring(0,i);
                String checkString1 = "";
                while (checkString1.length() < str1.length()){
                    checkString1 = checkString1 + substr;
                }
                String checkString2 = "";
                while (checkString2.length() < str2.length()) {
                    checkString2 = checkString2 + substr;
                }
                if (checkString1.equals(str1) && checkString2.equals(str2)) {
                    gcd = substr;
                }
            }

        }
        return gcd;
    }
}
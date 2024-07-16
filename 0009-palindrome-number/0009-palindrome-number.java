class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String number = String.valueOf(x);
        String reverse = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            reverse = reverse + number.charAt(i);
        }
        if (number.compareTo(reverse) == 0) {
            return true;
        }
        return false;
    }
}
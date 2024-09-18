class Solution {
    public int countGoodSubstrings(String s) {
        int goodSubstrings = 0;
        
        for (int i = 0; i < s.length() - 2; i++) {
            Set<String> set = new HashSet<String>();
            set.add(Character.toString(s.charAt(i)));
            set.add(Character.toString(s.charAt(i + 1)));
            set.add(Character.toString(s.charAt(i + 2)));
            if (set.size() == 3) {
                goodSubstrings++;
            }

           
        }
        return goodSubstrings;
    }
}
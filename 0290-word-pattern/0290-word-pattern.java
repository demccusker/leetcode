class Solution {
    public boolean wordPattern(String pattern, String s) {
        boolean hasPattern = true;
        String[] words = s.split(" ");
        if (pattern.length() != words.length){
            return false;
        }
        Map<Character, String> matches = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (!matches.containsKey(pattern.charAt(i)) && !matches.containsValue(words[i])){
                matches.put(pattern.charAt(i), words[i]);
            }
            else {
                
                if (!matches.getOrDefault(pattern.charAt(i),"").equals(words[i])){
                    hasPattern = false;
                    break;
                }
            }
        }

        return hasPattern;
    }
}
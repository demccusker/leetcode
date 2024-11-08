class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        boolean canConstruct = true;
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        Map<Character, Integer> noteCounts = new HashMap<>();
        Map<Character, Integer> magazineCounts = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++){
            noteCounts.put(ransomNote.charAt(i), noteCounts.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }
        for (int j = 0; j < magazine.length(); j++){
            magazineCounts.put(magazine.charAt(j), magazineCounts.getOrDefault(magazine.charAt(j), 0) + 1);
        }
        for (Character c : noteCounts.keySet()){
            if (magazineCounts.getOrDefault(c,0) < noteCounts.get(c)){
                canConstruct = false;
            }
        }
        return canConstruct;
    }
}
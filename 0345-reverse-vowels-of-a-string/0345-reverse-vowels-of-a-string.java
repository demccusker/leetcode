class Solution {
    public String reverseVowels(String s) {
        String reverseS = "";
        Set<String> vowels = new HashSet<>(Arrays.asList("a","e","i","o","u","A","E","I","O","U"));
        List<Integer> vowelIndexes = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(String.valueOf(s.charAt(i)))){
                vowelIndexes.add(i);
            }
        }
        int vowelCounter = vowelIndexes.size();
        for (int j = 0; j < s.length(); j++){
            
            if (vowels.contains(String.valueOf(s.charAt(j)))) {
                int newVowelIndex = vowelIndexes.get(vowelCounter - 1);
                char newChar = s.charAt(newVowelIndex);
                String newStr = String.valueOf(newChar);
                reverseS = reverseS + newStr; 
                vowelCounter--;

            }
            else {
                reverseS = reverseS + String.valueOf(s.charAt(j));
            }
        }
        return reverseS;
    }
}
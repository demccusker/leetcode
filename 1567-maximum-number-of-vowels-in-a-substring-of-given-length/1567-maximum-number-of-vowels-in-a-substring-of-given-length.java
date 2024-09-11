class Solution {
    public int maxVowels(String s, int k) {
        char[] vowels = {'a','e','i','o','u'};
        Set<Character> vowelSet = new HashSet<>();
        for (char vowel : vowels) {
            vowelSet.add(vowel);
        }

        int maxVowels = 0;
        int currentVowels = 0;
        for (int i = 0; i < k; i++) {
            char target = s.charAt(i);
            boolean containsTarget = vowelSet.contains(target);
            
            if (containsTarget) {
                
                currentVowels++;
            }
            maxVowels = currentVowels;

        }
        for (int j = 1; j <= s.length() - k; j++) {
            char oldTarget = s.charAt(j - 1);
            boolean containsOldTarget= vowelSet.contains(oldTarget);
            if (containsOldTarget) {
                currentVowels--;
            }
            char newTarget = s.charAt(j + k - 1);
            boolean containsNewTarget= vowelSet.contains(newTarget);
            if (containsNewTarget) {
                currentVowels++;
            }
            if (currentVowels > maxVowels) {
                maxVowels = currentVowels;
            }
            

        }
        return maxVowels;
        
    }
}
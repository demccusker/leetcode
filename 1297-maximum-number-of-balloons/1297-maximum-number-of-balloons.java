class Solution {
    public int maxNumberOfBalloons(String text) {
        int balloonCount = 0;
        Map<Character, Integer> balloonLetters = new HashMap<>();
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == 'b'  || text.charAt(i) == 'a' || text.charAt(i) == 'l' || text.charAt(i) == 'o' ||text.charAt(i) == 'n'){
                balloonLetters.put(text.charAt(i), (balloonLetters.getOrDefault(text.charAt(i),0) + 1));
                
            }
        }
        int bCount = balloonLetters.getOrDefault('b',0);
        
        int aCount = balloonLetters.getOrDefault('a',0);
        
        int lCount = balloonLetters.getOrDefault('l',0)/2;
        
        int oCount = balloonLetters.getOrDefault('o',0) /2;
        int nCount = balloonLetters.getOrDefault('n',0);

              

        
        return Math.min(bCount, Math.min(aCount, Math.min(lCount, Math.min(oCount, nCount))));
    }
}
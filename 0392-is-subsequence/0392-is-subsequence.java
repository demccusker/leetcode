class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean isSubsequence = false;
        int[] sIndexes = new int[s.length()];
        ;
        if (s.equals("")) {
            isSubsequence = true;
            return isSubsequence;
        }
        int startIndex = 0;
        // find the indexes of the members of s in t
        for (int i = 0; i < s.length(); i++){
            
            int index = t.indexOf(s.charAt(i),startIndex);
            if (index == -1){
                return isSubsequence;
            }
            else {
                sIndexes[i] = index;
                startIndex = index + 1;
                
                System.out.println(startIndex);
            }
        }
        for (int num : sIndexes) {
            System.out.println(num);
        }
        if (sIndexes.length == 1){
            isSubsequence = true;
            return isSubsequence;
        }
        //if s[i] < s[i + 1] for all values of s, s is a subsequence
        for (int j = 0; j < sIndexes.length - 1; j++){
            
            if (!(sIndexes[j] < sIndexes[j+1])){
                isSubsequence = false;
                return isSubsequence;
            }
            else {
                isSubsequence = true;
            }

        }
        return isSubsequence;
    }
}
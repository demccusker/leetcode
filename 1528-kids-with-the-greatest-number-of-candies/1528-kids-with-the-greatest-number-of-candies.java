class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> willHaveMostCandies = new ArrayList();
        for (int candyCount : candies) {
            int candyCountPlusExtras = candyCount + extraCandies;
            boolean thisKidHasTheMost = true;

            for (int candyComparison : candies) {
                if (candyComparison > candyCountPlusExtras) {
                    thisKidHasTheMost = false;
                }
                
            }
            willHaveMostCandies.add(thisKidHasTheMost);

        }
        return willHaveMostCandies;
    }
    
}
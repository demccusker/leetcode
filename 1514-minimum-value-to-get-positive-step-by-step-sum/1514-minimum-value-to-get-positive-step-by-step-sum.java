class Solution {
    public int minStartValue(int[] nums) {
        int startingValue = 1;
        int prefix = 0;
        int minPrefix = 1;
        for (int num : nums){
            prefix =+ prefix + num;
            //System.out.println("num is " + num + " prefix sum is " +prefix);
            minPrefix = Math.min(minPrefix,prefix);
            //System.out.println("min prefix sum is " +minPrefix);
            if (minPrefix < 1){
                startingValue = 1 -minPrefix;
            }
            
            
        }
        
        
        return startingValue;
            
    }
}
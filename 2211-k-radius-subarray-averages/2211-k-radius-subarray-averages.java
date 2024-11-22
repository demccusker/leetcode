class Solution {
    public int[] getAverages(int[] nums, int k) {       
    
       int[] averages = new int[nums.length];
        Arrays.fill(averages, -1);
        int len = nums.length;
        long runningTotal = 0;
        if (k == 0) {
            for (int j = 0; j<len;j++){
                averages[j]=nums[j];
            }
        }
        for (int i = 0; i < len; i++) {
            runningTotal = runningTotal + nums[i];
            //System.out.println(" i is " + i + " runningTotal is " + runningTotal);
        
            if ((i - k >= k) && (len - k >= 0) ) {
                long windowSize =((2 * k) + 1);
                int avg = (int) (runningTotal / windowSize);
                System.out.println("avg is " + avg);
                averages[i - k] = avg;
                runningTotal = runningTotal - nums[i - 2*k];
                
            }
            
            
        }
        return averages;
   }
}
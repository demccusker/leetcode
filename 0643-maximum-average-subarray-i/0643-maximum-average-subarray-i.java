class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = 0;
        double currentAverage = 0;
        for (int i = 0; i < k; i++) {
            currentAverage = currentAverage + nums[i];
            if (i == k - 1) {
                currentAverage = currentAverage / k;
                maxAverage = currentAverage;
                
            }
        }
        for (int j = 1; j <= nums.length - k; j++) {
            
            double oldValue  = (double)( (double) (nums[j-1])/k);
            double newValue = (double)( (double) (nums[j +k - 1])/k);
            
            currentAverage = currentAverage - oldValue + newValue;
            
            if (currentAverage > maxAverage) {
                maxAverage = currentAverage;
            }

        }

        return maxAverage;
    }
}
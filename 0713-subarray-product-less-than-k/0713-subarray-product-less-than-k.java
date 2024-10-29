class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int left = 0;
        int subarrayCount = 0;
        if (k <=1){
            return subarrayCount;
        }
        int runningAvg = 1;
        for (int right = 0; right < nums.length; right++){
            runningAvg *= nums[right];
            while (runningAvg >= k) {
                runningAvg /= nums[left];
                left++;

            }
            subarrayCount += right-left+1;

        }
        return subarrayCount;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++){
            Integer complement = target - nums[i];
            if (hashMap.containsKey(complement)) {
                ans[0] = i;
                ans[1] = hashMap.get(complement);
            }
            hashMap.put(nums[i], i);
        }
        return ans;
    }
}
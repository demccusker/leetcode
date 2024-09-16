class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean nearbyDupe = false; 
        if (k == 0) {
            return nearbyDupe;
        }
        else if (nums.length == 2) {
            if (nums[0] == nums[1]) {
                nearbyDupe = true;
                return nearbyDupe;
            }

        }

        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nearbyDupe = true;
                    return nearbyDupe;
                }
            }
        }
        return nearbyDupe;
    }
}
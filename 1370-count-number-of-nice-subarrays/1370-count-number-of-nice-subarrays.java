class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        int current = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);
        for ( int num : nums) {
            current += num % 2;
            count += counts.getOrDefault(current - k, 0);
            counts.put(current, counts.getOrDefault(current, 0) + 1);


        }
        return count;
    }
}
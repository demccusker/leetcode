class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean hasDupes = false;
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums){
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        for (int key : counts.keySet()){
            if (counts.get(key) > 1){
                hasDupes = true;
            }
        }
        return hasDupes;
    }
}
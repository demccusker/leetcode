class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean hasDupes = false;
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums){
            if (numbers.contains(num)){
                hasDupes = true;
                break;
            }
            else {
                numbers.add(num);
            }
        }
        return hasDupes;
    }
}
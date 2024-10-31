class Solution {
    public int countElements(int[] arr) {
        int count = 0;
        Set<Integer> nums = new HashSet<>();
        for (int num : arr){
            nums.add(num);
        }
        for (int num: arr){
            if (nums.contains(num+1)){
                count++;
            }
        }
        
        return count;
    }
}
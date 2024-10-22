class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sortedSquares = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            sortedSquares[left] = nums[left] * nums[left];
            sortedSquares[right] = nums[right]* nums[right];
            left++;
            right--;
            
        }
        Arrays.sort(sortedSquares);
        return sortedSquares;
    }
}
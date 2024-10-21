class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        int [] suffixes = suffix(nums);
        int[] prefixes = prefix(nums);
        for (int k = 0; k <= nums.length - 1; k++){
            products[k] = suffixes[k] * prefixes[k ];            
        }
        
        
        return products;
    }

    public int[] suffix(int[] nums) {
        int[] suffixes = new int[nums.length];
        Arrays.fill(suffixes, 1);
        for (int i = nums.length - 2; i >=0; i--) {
            suffixes[i] = suffixes[i + 1] * nums[i + 1];
            
            
        }
        return suffixes;

    }

    public int[] prefix (int[] nums) {
        int[] prefixes = new int[nums.length];
        Arrays.fill(prefixes,1);
        for (int j = 1; j <= nums.length - 1; j++){
            prefixes[j] = prefixes[j -1] * nums[j-1];
            

        }
        return prefixes;


    }
}
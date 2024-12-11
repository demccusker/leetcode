class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int commonInt = -1;
        if (nums1.length < nums2.length){
            Set<Integer> nums2List = new HashSet<>();
            for (int num : nums2){
                nums2List.add(num);
            }
            for (int num : nums1){
                if (nums2List.contains(num)){
                    commonInt = num;
                    return commonInt;
                }
            }
  

        }
        else{
            Set<Integer> nums1List = new HashSet<>();
            for (int num : nums1){
                nums1List.add(num);
            }
            for (int num : nums2){
                if (nums1List.contains(num)){
                    commonInt = num;
                    return commonInt;
                }
            }

        }
        return commonInt;
    }
}
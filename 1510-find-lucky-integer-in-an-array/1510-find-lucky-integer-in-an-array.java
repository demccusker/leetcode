class Solution {
    public int findLucky(int[] arr) {
        int luckyInteger = -1;
        Map<Integer,Integer> counts = new HashMap<>();
        for (int num : arr) {
            counts.put(num,counts.getOrDefault(num,0)+1);
        }
        for (int key : counts.keySet()){
            if (key > luckyInteger && key == counts.get(key)){
                luckyInteger = key;
            }
        }
    return luckyInteger;
    }
}
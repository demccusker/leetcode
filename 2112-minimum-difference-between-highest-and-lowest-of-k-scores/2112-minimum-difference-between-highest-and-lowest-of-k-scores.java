class Solution {
    public int minimumDifference(int[] nums, int k) {
        int minDiff = 0;
        sort(nums);
        for (int i = 0; i < nums.length - k + 1; i++) {
            int currentDiff = Math.abs(nums[i] - nums[i + k - 1]);
            System.out.println("first number: " + nums[i]);
            System.out.println("second number: " + nums[i + k - 1]);
            System.out.println("current diff: " + currentDiff);
            if (i == 0){
                minDiff = currentDiff;
            }
            else if (currentDiff < minDiff){
                minDiff = currentDiff;

            }
        }
        return minDiff;
    }

    public static void sort(int[] arr){
        if (arr == null || arr.length == 0){
            return;
        }
        int length = arr.length;
        quicksort(arr, 0,length - 1);
    }

    private static void quicksort(int[] arr, int low, int high){
        if (low < high) {
            int partitionIndex = partition(arr,low,high);
            quicksort(arr,low,partitionIndex - 1);
            quicksort(arr,partitionIndex + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1; 
    }



    
}
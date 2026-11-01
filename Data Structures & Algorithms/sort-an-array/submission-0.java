class Solution {
    public int[] sortArray(int[] nums) {
        countingSort(nums);
        return nums;
    }

    private void countingSort(int[] arr){
        HashMap<Integer, Integer> count = new HashMap<>(); 
       int minVal = arr[0], maxVal = arr[0];

       for(int i = 0; i < arr.length; i++){
        minVal = Math.min(minVal, arr[i]);
        maxVal = Math.max(maxVal, arr[i]);
        count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
       }

       int index = 0;
       for(int j = minVal; j <= maxVal; ++j){
        while(count.getOrDefault(j, 0) > 0){
            arr[index] = j;
            index += 1;
            count.put(j, count.get(j) - 1);
        }
       }
    }
}
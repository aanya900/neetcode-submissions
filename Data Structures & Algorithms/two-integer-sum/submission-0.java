class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            int diff = target - n;

            if(h.containsKey(diff)){
                return new int[] {h.get(diff), i};
            }
            h.put(n, i);
        }

        return new int[] {};
    }
}

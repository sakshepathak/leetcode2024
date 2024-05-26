class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> newMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if(newMap.containsKey(dif)) {
                return new int [] {newMap.get(dif), i};
            }
            newMap.put(nums[i], i);
        }
        return new int[] {};
    }
}

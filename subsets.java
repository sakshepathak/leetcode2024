class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
    private void backtrack(int [] nums, int start, List<Integer> path, List<List<Integer>>ans){
        ans.add(new ArrayList<>(path));
        for(int i=start; i<nums.length; i++) {
            path.add(nums[i]);
            backtrack(nums, i+1, path, ans);
            path.remove(path.size() -1);

        }
    }
}

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void helper(int[] nums, int index, List<Integer> ds, List<List<Integer>> ans) {
        if(index >= nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        ds.add(nums[index]);
        helper(nums, index + 1, ds, ans);
        ds.remove(ds.size() - 1);
        helper(nums, index + 1, ds, ans);
        
    }
}
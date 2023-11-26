class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int i=nums.length;
        int num=nums[i-k];
        return num;
        
    }
}
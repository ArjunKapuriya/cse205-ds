class Solution {
    public int triangularSum(int[] nums) {
         int n = nums.length;
        for(int i = 1; i <= n - 1; i++){
            for(int j = 0; j < n - 1; j++){
                nums[j] = (nums[j] + nums[j + 1]) % 10;
            }
        }
        return nums[0];

        
    }
}
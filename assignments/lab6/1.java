class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=1+i;j<nums.length;j++){
                if(target==nums[i]+nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
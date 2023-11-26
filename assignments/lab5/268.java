class Solution {
    public int missingNumber(int[] nums) {
       
        int sum=0;
        for(int n=0;n<=nums.length;n++){
            sum=sum+n;

        }
        int i=0;
        
        int sum1=0;
        for(i=0;i<nums.length;i++){
            sum1=sum1+nums[i];
        }
        return sum-sum1;
        
    }
}
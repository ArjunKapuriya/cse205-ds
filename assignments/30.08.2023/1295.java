class Solution {
    public int findNumbers(int[] nums) {
        int count =0;

        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            int sum = 0;

            while(n>0){
                int r = n%10;
                sum++;
                n = n/10;
            }
            if(sum%2==0){
                count++;
            }
        }
        return count;
        
    }
}
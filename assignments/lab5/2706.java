class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum=prices[0]+prices[1];
        if(sum==money){
            return 0;
        
        }
        else if(sum>money){
            return money;
        }
        int left=0;
        if(money>sum){
            left=money-sum;
        }
        return left;

        
    }
}
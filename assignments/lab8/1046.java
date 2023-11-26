class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int i=stones.length;
        if(i==1){
            return stones[0];
        }
        while(stones[i-2]>0){
            int difference=stones[i-1]-stones[i-2];
            stones[i-2]=0;
            stones[i-1]=difference;
            Arrays.sort(stones);
        }
        return stones[i-1];
        
        
    }
}
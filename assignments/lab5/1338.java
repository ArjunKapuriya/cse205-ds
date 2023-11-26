class Solution {
    public int minSetSize(int[] arr) {
        
        HashMap<Integer,Integer> collector = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
        int total = 0;
        int k = 0;

        for(int i:arr)
        {
            collector.put(i,collector.getOrDefault(i,0)+1);
        }

        for(int value:collector.values())
        {
            pq.offer(value);
        }

        while(total < arr.length/2)
        {
            total+=pq.poll();
            k++;
        }

        return k;

    }
}
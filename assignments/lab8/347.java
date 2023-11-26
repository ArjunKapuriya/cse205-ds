class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> frequentMap = new HashMap<>();

        for (int i: nums) {
            if(!frequentMap.containsKey(i)) {
                frequentMap.put(i, 1);
                continue;
            }
            int v = frequentMap.get(i) + 1;
            frequentMap.put(i, v);
        }
        List<Map.Entry<Integer, Integer>> l = frequentMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).toList();
        int[] re = new int[k];
        for (int i = 0; i<k; i++) {
            re[i] = l.get(l.size()-k+i).getKey();
        }
        return re;
    }
}
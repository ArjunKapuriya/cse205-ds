class Solution {
    public boolean isNStraightHand(int[] hand, int gSize) {
        if (hand.length % gSize != 0) {
            return false;
        }
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : hand) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (int num : map.keySet()) {
            int count = map.get(num);
            if (count > 0) {
                for (int i = 0; i < gSize; i++) {
                    if (!map.containsKey(num + i) || map.get(num + i) < count) {
                        return false;
                    }
                    map.put(num + i, map.get(num + i) - count);
                }
            }
        }
        
        return true;
    }
}
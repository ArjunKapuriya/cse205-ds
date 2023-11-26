class Solution {
    public String customSortString(String order, String s) {
        PriorityQueue<Character> pq = new PriorityQueue<>(new Comparator<Character>(){
            @Override
            public int compare(Character ch1, Character ch2) {
                return Integer.compare(order.indexOf(ch1), order.indexOf(ch2));
            }
        });

        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (order.indexOf(ch) == -1) {
                sb.append(ch);
            } else {
                pq.add(ch);
            }
        }

        while (!pq.isEmpty()) {
            sb.append(pq.poll());
        }
        return sb.toString();
    }
}
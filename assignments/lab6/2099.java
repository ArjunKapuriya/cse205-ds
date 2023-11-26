class Solution {
    static class Item {
        int value, index;

        Item(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }


    static public int[] maxSubsequence(int[] nums, int k) {
        int[] result = new int[k];
        PriorityQueue<Item> valuePriorityQueue = new PriorityQueue<>(new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {
                return i2.value - i1.value;
            }
        });
        PriorityQueue<Item> indexPriorityQueue = new PriorityQueue<>(new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {
                return i1.index - i2.index;
            }
        });

        for (int i = 0; i < nums.length; i++) {
            Item item = new Item(nums[i], i);
            valuePriorityQueue.add(item);
        }

        for (int i = 0; i < k; i++) {
            indexPriorityQueue.add(valuePriorityQueue.poll());
        }

        for (int i = 0; i < k; i++) {
            result[i] = indexPriorityQueue.poll().value;
        }

        return result;
    }
}
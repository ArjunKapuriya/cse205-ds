class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int dup = 0, miss = 0;

        for (int i : nums) {
            if (set.contains(i)) {
                dup = i;
            }
            set.add(i);
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                miss = i;
            }
        }

        return new int[] {dup, miss};
    }
}

// TC: O(n), SC: O(n)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Putin> list = new ArrayList<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        inOrder(root, 0, 0);
        return result();
    }
    List<List<Integer>> result(){
        Collections.sort(list);

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            cur.add(list.get(i).rootVal);
            if (i + 1 < list.size() && list.get(i).y == list.get(i + 1).y) {
                continue;
            }
            res.add(new ArrayList<>(cur));
            cur.clear();
        }

        return res;
    }
    void inOrder(TreeNode root, int x, int y){
        if(root == null) return;
        inOrder(root.left, x + 1, y - 1);
        list.add(new Putin(root.val, x, y));
        inOrder(root.right, x + 1, y + 1);
    }
    class Putin implements Comparable<Putin>{
        int rootVal;
        int x;
        int y;
        Putin(int rootVal, int x, int y){
            this.rootVal = rootVal;
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Putin o1) {
            int res = Integer.compare(this.y, o1.y);
            if(res != 0)
                return res;
            else{
                int a = Integer.compare(this.y, o1.y);
                int b = Integer.compare(this.x, o1.x);
                if(a == b) return Integer.compare(this.rootVal, o1.rootVal);
                return Integer.compare(this.x, o1.x);
            }
        }
        @Override
        public String toString() {
            return rootVal + ":(" + x + "," + y + ")";
        }
    }
}
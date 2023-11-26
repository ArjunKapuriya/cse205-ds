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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        boolean flag=true;
        if(root==null) return ans;
        queue.offer(root);
        while(!queue.isEmpty()){
            int s=queue.size();
            List<Integer> list= new LinkedList<Integer>();
            for(int i=0;i<s;i++){
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                if(flag) list.add(queue.poll().val);
                else list.add(0,queue.poll().val);
                
            }
            flag=!flag;
            ans.add(list);

        }
        return ans;
        
    }
}
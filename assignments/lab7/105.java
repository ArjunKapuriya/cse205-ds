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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        
    }
    public TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
    if (preStart > preEnd || inStart > inEnd) {
        return null;
    }
    int rootVal = preorder[preStart];
    TreeNode root = new TreeNode(rootVal);

    int rootIndexInorder = inStart;
    while (inorder[rootIndexInorder] != rootVal) {
        rootIndexInorder++;
    }

    int leftSubtreeSize = rootIndexInorder - inStart;

    root.left = buildTree(preorder, preStart + 1, preStart + leftSubtreeSize, inorder, inStart, rootIndexInorder - 1);
    root.right = buildTree(preorder, preStart + leftSubtreeSize + 1, preEnd, inorder, rootIndexInorder + 1, inEnd);

    return root;
}
}
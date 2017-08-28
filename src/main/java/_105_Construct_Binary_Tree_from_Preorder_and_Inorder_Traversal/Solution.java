package _105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(0, 0, preorder.length - 1, preorder, inorder);
    }

    private TreeNode build(int pStart, int iStart, int iEnd, int[] preorder, int[] inorder){
        if (pStart + 1 > preorder.length || iStart > iEnd) return null;
        int mid = -1;
        for (int i = 0; i < iEnd + 1; i ++){
            if (inorder[i] == preorder[pStart]){
                mid = i;
                break;
            }
        }
        TreeNode root = new TreeNode(preorder[pStart]);
        root.left = build(pStart + 1, iStart, mid - 1, preorder, inorder);
        root.right = build(mid - iStart + pStart + 1, mid + 1, iEnd, preorder, inorder);
        return root;
    }
}

package _114_Flatten_Binary_Tree_to_Linked_List;

import java.util.LinkedList;
import java.util.List;

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
    List<TreeNode> list = new LinkedList<>();
    public void flatten(TreeNode root) {
        if (root == null) return;
        scan(root);
        TreeNode result = null;
        TreeNode current = null;
        for(TreeNode node: list){
            if (result == null){
                result = node;
            } else {
                current.right = node;
            }
            current = node;
        }
        root.left = null;
        root.right = result.right;
    }

    private void scan(TreeNode root){
        if (root == null) return;
        list.add(root);
        scan(root.left);
        scan(root.right);
    }

}
package _366_Find_Leaves_of_Binary_Tree;

import java.util.List;
import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


class Solution {
    private List<List<Integer>> result = new LinkedList<>();
    private List<Integer> current = null;

    public List<List<Integer>> findLeaves(TreeNode root) {
        boolean empty = false;
        while (!empty && root != null) {
            current = new LinkedList<>();
            empty = cutLeaf(root);
            result.add(current);
        }
        return result;

    }

    private boolean cutLeaf(TreeNode node){
        if (node.left == null && node.right == null){
            current.add(node.val);
            return true;
        }
        if (node.left != null){
            if (cutLeaf(node.left)) node.left = null;
        }
        if (node.right != null){
            if (cutLeaf(node.right)) node.right = null;
        }
        return false;
    }
}

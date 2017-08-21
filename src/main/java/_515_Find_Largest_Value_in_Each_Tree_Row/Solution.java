package _515_Find_Largest_Value_in_Each_Tree_Row;

import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    List<Integer> result = new LinkedList<>();
    public List<Integer> largestValues(TreeNode root) {
        findNum(root, 0);
        return this.result;
    }

    private void findNum(TreeNode node, int level){
        if (node == null) return;
        if (this.result.size() <= level){
            this.result.add(node.val);
        } else {
            if (this.result.get(level) < node.val){
                this.result.set(level, node.val);
            }
        }
        findNum(node.left, level + 1);
        findNum(node.right, level + 1);
    }
}

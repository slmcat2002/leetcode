package _199_Binary_Tree_Right_Side_View;

import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<TreeNode> list = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        list.add(root);
        while(list.size() > 0){
            queue.addAll(list);
            list.clear();
            TreeNode last = null;
            while(queue.size() > 0){
                TreeNode current = queue.poll();
                if (current == null) continue;
                last = current;
                list.add(last.left);
                list.add(last.right);
            }
            if (last != null) result.add(last.val);
        }
        return result;
    }
}




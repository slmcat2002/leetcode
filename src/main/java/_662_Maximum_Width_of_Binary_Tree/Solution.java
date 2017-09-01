package _662_Maximum_Width_of_Binary_Tree;

import java.util.LinkedList;

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
    public int widthOfBinaryTree(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (root == null) return 0;
        queue.add(root);
        int maxWidth = 0;
        while(queue.size() > 0){
            int size = queue.size();
            boolean foundFirst = false;
            int first = 0;
            int current = 0;
            int last = 0;
            int thisWidth = 0;
            for(int i = 0; i < size; i ++){
                TreeNode node = queue.poll();
                current ++;
                if(node != null){
                    if(!foundFirst){
                        first = current;
                    }
                    foundFirst = true;
                    last = current;
                    queue.add(node.left);
                    queue.add(node.right);
                } else {
                    queue.add(null);
                    queue.add(null);
                }
            }
            if(foundFirst) {
                thisWidth = last - first + 1;
                maxWidth = Math.max(maxWidth, thisWidth);
            } else {
                break;
            }
        }
        return maxWidth;
    }
}



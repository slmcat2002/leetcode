package _513_Find_Bottom_Left_Tree_Value;
import java.util.LinkedList;
import java.util.List;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    List<Integer> level_list = new LinkedList<>();
    public int findBottomLeftValue(TreeNode root) {
        findLeft(root, 1);
        return level_list.get(level_list.size() - 1);
    }

    public void findLeft(TreeNode node, int level){
        if (node == null){
            return;
        }
        if (level > level_list.size()){
            level_list.add(node.val);
        }
        findLeft(node.left, level + 1);
        findLeft(node.right, level + 1);
    }

}


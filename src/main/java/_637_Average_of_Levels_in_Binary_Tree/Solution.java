package _637_Average_of_Levels_in_Binary_Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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

class Level {
    int count = 0;
    double num = 0;
}

public class Solution {
    Map<Integer, Level> levelMap = new HashMap<>();
    public List<Double> averageOfLevels(TreeNode root) {
        getNum(root, 0);
        List<Double> result = new LinkedList<>();
        for (int i = 0; i < levelMap.keySet().size(); i ++){
            Level level = levelMap.get(i);
            Double num = level.num / (double)level.count;
            result.add(num);
        }
        return result;
    }

    public void getNum(TreeNode node, int depth){
        if (node == null) return;
        if (!this.levelMap.containsKey(depth)){
            Level level = new Level();
            this.levelMap.put(depth, level);
        }
        this.levelMap.get(depth).num += node.val;
        this.levelMap.get(depth).count += 1;
        getNum(node.left, depth + 1);
        getNum(node.right, depth + 1);
    }
}


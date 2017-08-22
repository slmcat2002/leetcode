package _508_Most_Frequent_Subtree_Sum;


import java.lang.reflect.Array;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    HashMap<Integer, Integer> counter = new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null) return new int[]{};
        this.sum(root);
        Collection<Integer> rank = counter.values();
        List<Integer> r = new LinkedList<>();
        r.addAll(rank);
        Collections.sort(r);
        int max = r.get(r.size() - 1);
        List<Integer> resultList = new LinkedList<>();
        for (Integer sum: counter.keySet()){
            if (counter.get(sum) == max) resultList.add(sum);
        }
        return Arrays.stream(resultList.toArray()).mapToInt(n -> (int)n).toArray();
    }

    private int sum(TreeNode node){
        if (node == null) return 0;
        int sum = node.val +  this.sum(node.left) + this.sum(node.right);
        if (counter.containsKey(sum)){
            int count = counter.get(sum);
            counter.put(sum, count + 1);
        }
        else {
            counter.put(sum, 1);
        }
        return sum;
    }
}
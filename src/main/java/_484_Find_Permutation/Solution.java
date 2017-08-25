package _484_Find_Permutation;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Solution {
    public int[] findPermutation(String s) {
        List<Integer> list = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int current = 0;
        String str = s + "I";
        for (char c: str.toCharArray()){
            current ++;
            if (c == 'D'){
                stack.push(current);
            } else {
                list.add(current);
                while (!stack.empty()) list.add(stack.pop());
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i ++){
            result[i] = list.get(i);
        }
        return result;
    }
}


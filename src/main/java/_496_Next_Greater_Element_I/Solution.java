package _496_Next_Greater_Element_I;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        HashMap<Integer, Integer> num2index = new HashMap<>();
        for (int n = 0; n < nums.length; n ++){
            num2index.put(nums[n], n);
        }
        int[] result = new int[findNums.length];
        Arrays.fill(result, -1);
        for (int f = 0; f < findNums.length; f ++){
            int start = num2index.get(findNums[f]);
            for (int n = start; n < nums.length; n ++){
                if (nums[n] > findNums[f]){
                    result[f] = nums[n];
                    break;
                }
            }
        }
        return result;
    }
}


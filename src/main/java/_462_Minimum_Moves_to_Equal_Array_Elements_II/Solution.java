package _462_Minimum_Moves_to_Equal_Array_Elements_II;

import java.util.Arrays;

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int result = 0;
        while (start < end){
            result = result + nums[end] - nums[start];
            start ++;
            end --;
        }
        return result;
    }
}


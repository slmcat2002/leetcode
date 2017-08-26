package _503_Next_Greater_Element_II;


class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] tmp = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i ++){
            tmp[i] = nums[i];
            tmp[i + nums.length] = nums[i];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i ++){
            result[i] = -1;
            for (int g = 0; g < nums.length; g ++){
                if (tmp[i + g] > nums[i]) {
                    result[i] = tmp[i + g];
                    break;
                }
            }
        }
        return result;
    }
}


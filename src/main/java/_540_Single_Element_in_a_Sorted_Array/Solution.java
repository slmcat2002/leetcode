package _540_Single_Element_in_a_Sorted_Array;

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int result = 0;
        for (int n: nums){
            result = result ^ n;
        }
        return result;
    }
}

package _189_Rotate_Array;

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        invent(nums, 0, nums.length - 1);
        invent(nums, 0, k - 1);
        invent(nums, k, nums.length - 1);
    }

    private void invent(int[] nums, int start, int end){
        while(start < end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start ++;
            end --;
        }
    }

}



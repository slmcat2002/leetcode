package _260_Single_Number_III;

public class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int i: nums){
            xor ^= i;
        }
        xor &= -xor;
        int[] result = new int[]{0, 0};
        for (int i: nums){
            if ((xor & i) == 0) result[0] ^= i;
            else result[1] ^= i;
        }
        return result;
    }
}


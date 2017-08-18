package _448_Find_All_Numbers_Disappeared_in_an_Array;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] tmp = new int[nums.length];
        List<Integer> result = new LinkedList<>();
        for (int n: nums){
            tmp[n - 1] = 1;
        }
        for (int n = 0; n < tmp.length; n ++){
            if (tmp[n] != 1){
                result.add(n + 1);
            }
        }
        return result;
    }
}

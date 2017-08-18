package _442_Find_All_Duplicates_in_an_Array;

import java.util.List;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> dup = new HashSet<>();
        List<Integer> result = new LinkedList<>();
        for (int num : nums) {
            if (dup.contains(num)) {
                result.add(num);
            } else {
                dup.add(num);
            }
        }
        return result;
    }
}
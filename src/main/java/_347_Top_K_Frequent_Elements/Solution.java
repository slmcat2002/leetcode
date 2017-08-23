package _347_Top_K_Frequent_Elements;

import java.util.*;

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n: nums){
            if (map.containsKey(n)){
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        List<Integer> sortList = new LinkedList<>();
        sortList.addAll(map.values());
        sortList.sort(Comparator.comparingInt(i -> -i));
        HashSet<Integer> rank = new HashSet<>();
        int limit = 0;
        for (int r: sortList) {
            if (limit >= k) break;
            rank.add(r);
            limit ++;
        }
        for (int num: map.keySet()){
            if (rank.contains(map.get(num))){
                result.add(num);
            }
        }
        return result;
    }
}



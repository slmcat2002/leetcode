package _296_Best_Meeting_Point;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class Solution {
    public int minTotalDistance(int[][] grid) {
        LinkedList<Integer> x_list = new LinkedList<>();
        LinkedList<Integer> y_list = new LinkedList<>();
        for (int y = 0; y < grid.length; y ++){
            for (int x = 0; x < grid[y].length; x ++){
                if (grid[y][x] == 1){
                    x_list.add(x);
                    y_list.add(y);
                }
            }
        }
        return getMin(x_list) + getMin(y_list);
    }

    private int getMin(List<Integer> list){
        if (list.size() == 0){
            return 0;
        }
        int result = 0;
        Collections.sort(list);
        int mid = list.get(list.size() / 2);
        for (int p: list){
            result += Math.abs(mid - p);
        }
        return result;
    }


}


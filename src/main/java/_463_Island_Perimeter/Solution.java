package _463_Island_Perimeter;

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for (int x = 0; x < grid.length; x++){
            for (int y = 0; y < grid[x].length; y++){
                if (grid[x][y] != 1) continue;
                count += 4;
                if ( y > 0 && grid[x][y - 1] == 1) count -= 2;
                if ( x > 0 && grid[x - 1][y] == 1) count -= 2;
            }
        }
        return count;
    }
}

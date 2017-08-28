package _200_Number_of_Islands;

class Solution {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int y = 0; y < grid.length; y ++){
            for (int x = 0; x < grid[y].length; x ++){
                if (grid[y][x] == '1'){
                    count ++;
                    search(x, y, grid);
                }
            }
        }
        return count;
    }

    private void search(int x, int y, char[][] grid){
        if (y < 0 || y >= grid.length || x < 0 || x >= grid[y].length){
            return;
        }
        if (grid[y][x] == '1'){
            grid[y][x] = '0';
            search(x - 1, y, grid);
            search(x + 1, y, grid);
            search(x, y - 1, grid);
            search(x, y + 1, grid);
        }
    }
}
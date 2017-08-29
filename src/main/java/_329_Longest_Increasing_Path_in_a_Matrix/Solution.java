package _329_Longest_Increasing_Path_in_a_Matrix;

class Solution {
    int[][] search ={{0,1}, {0,-1}, {1,0}, {-1,0}};

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0) return 0;
        int[][] mem = new int[matrix.length][matrix[0].length];
        int result = 0;
        for (int y = 0; y < matrix.length; y ++){
            for (int x = 0; x < matrix[y].length; x ++){
                result = Math.max(result, detect(matrix, x, y, mem));
            }
        }
        for (int y = 0; y < matrix.length; y ++){
            for (int x = 0; x < matrix[y].length; x ++){
                System.out.print(mem[y][x]);
                System.out.print(' ');
            }
            System.out.print('\n');
        }
        return result;
    }

    private int detect(int[][] matrix, int x, int y, int[][] mem){
        if (mem[y][x] != 0) return mem[y][x];
        for (int[] d: search){
            int xn = x + d[0];
            int yn = y + d[1];
            if (xn >= 0 && xn < matrix[y].length && yn >= 0 && yn < matrix.length
                    && matrix[y][x] > matrix[yn][xn]){
                mem[y][x] = Math.max(mem[y][x], detect(matrix, xn, yn, mem));
            }
        }
        mem[y][x] += 1;
        return mem[y][x];
    }
}

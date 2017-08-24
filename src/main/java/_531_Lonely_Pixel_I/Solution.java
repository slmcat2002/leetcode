package _531_Lonely_Pixel_I;

class Solution {
    public int findLonelyPixel(char[][] picture) {
        if (picture.length == 0) return 0;
        int result = 0;
        for (int y = 0; y < picture.length; y ++){
            for (int x = 0; x < picture[y].length; x ++){
                if (picture[y][x] == 'B') {
                    if (search(x, y, picture)) result ++;
                }
            }
        }
        return result;
    }

    private boolean search(int x_tar, int y_tar, char[][] picture){
        int count = 1;
        for (int x = 0; x < picture[y_tar].length; x ++){
            if (picture[y_tar][x] == 'B' && x != x_tar) count ++;
        }
        for (int y = 0; y < picture.length; y ++){
            if (picture[y][x_tar] == 'B' && y != y_tar) count ++;
        }
        return count == 1;
    }
}

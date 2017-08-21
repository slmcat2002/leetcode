package _657_Judge_Route_Circle;

class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char s : moves.toCharArray()){
            switch (s){
                case 'R':
                    x ++; break;
                case 'L':
                    x --; break;
                case 'U':
                    y ++; break;
                case 'D':
                    y --; break;
            }
        }
        return x == 0 && y == 0;
    }
}




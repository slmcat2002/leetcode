package _50_Pow_x_n;

class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        long ln = Math.abs((long)n);
        double result = 1;
        while(ln > 0){
            if (ln % 2 != 0) result *= x;
            x *= x;
            ln = ln / 2;
        }
        if (n < 0) {
            result = 1 / result;
        }
        return result;
    }
}




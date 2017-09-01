package _69_Sqrt_x;

class Solution {
    public int mySqrt(int x) {
        if (x <= 0) return 0;
        if (x == 1) return 1;
        int start = 0;
        int end = x;
        int mid = 0;
        int result = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid <= x / mid) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

}



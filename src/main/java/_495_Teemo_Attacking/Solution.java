package _495_Teemo_Attacking;

import java.util.HashSet;

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = 0;
        int lastDot = 0;
        for(int num: timeSeries){
            int nextDot = num + duration;
            if (num >= lastDot){
                result += duration;
            } else {
                result += nextDot - lastDot;
            }
            lastDot = nextDot;
        }
        return result;
    }
}


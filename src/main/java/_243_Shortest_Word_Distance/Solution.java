package _243_Shortest_Word_Distance;

import org.omg.PortableInterceptor.INACTIVE;

class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int w1 = -1;
        int w2 = -1;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i ++){
            if (word1.equals(words[i])){
                w1 = i;
            }
            if (word2.equals(words[i])){
                w2 = i;
            }
            if (w1 >= 0 && w2 >= 0)
                result = Math.min(result, Math.abs(w1 - w2));
        }
        return result;
    }
}



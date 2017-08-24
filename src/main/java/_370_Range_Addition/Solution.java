package _370_Range_Addition;

class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] tmp = new int[length + 1];
        for (int[] update: updates){
            tmp[update[0]] += update[2];
            tmp[update[1] + 1] -= update[2];
        }
        for (int i = 1; i < length; i ++){
            tmp[i] += tmp[i - 1];
        }
        int[] result = new int[length];
        for (int i = 0; i < length; i ++){
            result[i] = tmp[i];
        }
        return result;
    }

}

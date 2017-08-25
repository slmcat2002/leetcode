package _647_Palindromic_Substrings;

class Solution {
    public int countSubstrings(String s) {
        int result = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i ++){
            result += find(i, i, arr);
            result += find(i, i + 1, arr);
        }
        return result;
    }

    public int find(int start, int end, char[] arr){
        int count = 0;
        while(start >= 0 && end < arr.length){
            if (arr[start] == arr[end]){
                count ++;
            } else {
                break;
            }
            start --;
            end ++;
        }
        return count;
    }

}



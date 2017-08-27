package _273_Integer_to_English_Words;

import java.util.HashMap;
import java.util.Map;

class Solution {
    Map<Integer, String> dictionaryLess20 = new HashMap<>();
    Map<Integer, String> dictionaryLess90 = new HashMap<>();
    Map<Integer, String> dictionaryRank = new HashMap<>();

    public Solution(){
        initDictionary();
    }


    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        return convertSplitBy1000(num);
    }

    private String convertSplitBy1000(int num) {
        int left = num;
        int rank = 0;
        String result = "";
        while (left > 0){
            int current = left % 1000;
            String currentRes = convertLessThan1000(current);
            if (currentRes.length() > 0){
                if (result.length() > 0) result = " " + result;
                String rankRes = dictionaryRank.get(rank);
                if (rankRes.length() > 0) rankRes = " " + rankRes;
                currentRes += rankRes;
                result = currentRes + result;
            }
            left = left / 1000;
            rank ++;
        }
        return result;
    }

    private String convertLessThan1000(int num){
        String result = "";
        String H = "";
        if (num >= 100) {
            H = dictionaryLess20.get(num / 100) + " " + "Hundred";
        }
        String T = "";
        if (num % 100 < 20){
            T = dictionaryLess20.get(num % 100);
        } else {
            String T1 = dictionaryLess90.get((num % 100) / 10);
            String T2 = dictionaryLess20.get(num % 10);
            T = T1;
            if (T2.length() > 0) T += " " + T2;
        }
        result += H;
        if (result.length() > 0 && T.length() > 0) result += " ";
        result += T;
        return result;
    }

    private void initDictionary(){

        dictionaryLess20.put(0, "");
        dictionaryLess20.put(1, "One");
        dictionaryLess20.put(2, "Two");
        dictionaryLess20.put(3, "Three");
        dictionaryLess20.put(4, "Four");
        dictionaryLess20.put(5, "Five");
        dictionaryLess20.put(6, "Six");
        dictionaryLess20.put(7, "Seven");
        dictionaryLess20.put(8, "Eight");
        dictionaryLess20.put(9, "Nine");
        dictionaryLess20.put(10, "Ten");
        dictionaryLess20.put(11, "Eleven");
        dictionaryLess20.put(12, "Twelve");
        dictionaryLess20.put(13, "Thirteen");
        dictionaryLess20.put(14, "Fourteen");
        dictionaryLess20.put(15, "Fifteen");
        dictionaryLess20.put(16, "Sixteen");
        dictionaryLess20.put(17, "Seventeen");
        dictionaryLess20.put(18, "Eighteen");
        dictionaryLess20.put(19, "Nineteen");

        dictionaryLess90.put(2, "Twenty");
        dictionaryLess90.put(3, "Thirty");
        dictionaryLess90.put(4, "Forty");
        dictionaryLess90.put(5, "Fifty");
        dictionaryLess90.put(6, "Sixty");
        dictionaryLess90.put(7, "Seventy");
        dictionaryLess90.put(8, "Eighty");
        dictionaryLess90.put(9, "Ninety");

        dictionaryRank.put(0, "");
        dictionaryRank.put(1, "Thousand");
        dictionaryRank.put(2, "Million");
        dictionaryRank.put(3, "Billion");
    }
}




package _451_Sort_Characters_By_Frequency;

import java.util.HashMap;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Comparator;

class Solution {
    HashMap<Character, StringBuilder> group = new HashMap<>();
    public String frequencySort(String s) {
        StringBuilder result = new StringBuilder();
        for(char w: s.toCharArray()){
            if (group.containsKey(w)){
                group.get(w).append(w);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(w);
                group.put(w, sb);
            }
        }
        Collection<StringBuilder> rank = group.values();
        LinkedList<StringBuilder> r = new LinkedList<>();
        r.addAll(rank);
        r.sort(new comp());
        for (StringBuilder sb: r){
            result.append(sb);
        }
        return result.reverse().toString();
    }
    class comp implements Comparator<StringBuilder> {
        public int compare(StringBuilder o1, StringBuilder o2) {
            return Integer.compare(o1.length(), o2.length());
        }
    }
}



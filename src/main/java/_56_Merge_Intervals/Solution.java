package _56_Merge_Intervals;


import java.util.Comparator;
import java.util.List;
import java.util.LinkedList;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        intervals.sort(Comparator.comparingInt(i -> i.start));
        List<Interval> result = new LinkedList<>();
        Interval last = null;
        for (Interval i: intervals){
            if (last == null) {
                last = new Interval(i.start, i.end);
            }
            else if (i.start > last.end){
                result.add(last);
                last = new Interval(i.start, i.end);
            }
            else if (i.start <= last.end && last.end < i.end){
                last.end = i.end;
            }
        }
        if (last != null){
            result.add(last);
        }
        return result;
    }
}



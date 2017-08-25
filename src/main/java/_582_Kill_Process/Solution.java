package _582_Kill_Process;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

class Solution {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        Map<Integer, List<Integer>> refMap = new HashMap<>();
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < pid.size(); i ++){
            if (!refMap.containsKey(ppid.get(i))) refMap.put(ppid.get(i), new LinkedList<>());
            refMap.get(ppid.get(i)).add(pid.get(i));
        }
        Queue<Integer> queue = new LinkedBlockingQueue<>();
        queue.add(kill);
        while (!queue.isEmpty()){
            int k = queue.poll();
            result.add(k);
            if (refMap.containsKey(k)){
                queue.addAll(refMap.get(k));
            }
        }
        return result;
    }
}

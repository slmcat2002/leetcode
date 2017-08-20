package _526_Beautiful_Arrangement;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Solution {
    private Queue<Integer> nodes = new LinkedBlockingQueue<>();
    private int result = 0;
    private int total = 0;
    public int countArrangement(int N) {
        this.total = N;
        for (int i = 1; i < N + 1; i ++){
            nodes.add(i);
        }
        checkNum(N);
        return result;
    }

    private void checkNum(int level){
        if (this.nodes.isEmpty()){
            this.result ++;
            return;
        }
        int index = total - level + 1;
        for(int i = 0; i < level; i ++){
            int num = this.nodes.poll();
            if (index % num == 0 || num % index == 0){
                checkNum(level - 1);
            }
            this.nodes.add(num);
        }
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.countArrangement(16));
    }

}

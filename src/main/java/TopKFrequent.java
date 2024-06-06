import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {

    }

    private static int[] topKFrequent(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Queue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for(Map.Entry<Integer, Integer> i : map.entrySet()){
            q.add(i);
            if(q.size() > k){
                q.poll();
            }
        }
        int[] ans = new int[k];
        int ind = 0;
        while(!q.isEmpty()){
            ans[ind++] = q.poll().getKey();
        }
        return ans;
    }
}

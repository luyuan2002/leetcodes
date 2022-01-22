package cn.xiaoyes.algorithm.day0122;

import java.util.*;

public class LeetCode347 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int cur : nums) map.put(cur,map.getOrDefault(cur,0) + 1);
        PriorityQueue<Integer> queue = new PriorityQueue<>((n, m) -> map.get(m) - map.get(n));
        for (Integer key : map.keySet()) {
            if (queue.size() < k){
                queue.add(key);
            }else if (map.get(key) > map.get(queue.peek())){
                queue.remove();
                queue.add(key);
            }
        }
        int[] res = new int[k];
        int i = 0;
        while (!queue.isEmpty()) res[i++] = queue.remove();
        return res;
    }
}

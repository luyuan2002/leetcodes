package cn.xiaoyes.algorithm.day0211;

import java.util.Arrays;
import java.util.LinkedList;

public class LeetCode406 {
    public static void main(String[] args) {
        LeetCode406 code = new LeetCode406();
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        long start = System.nanoTime();
        int[][] res = code.reconstructQueue(people);
        System.out.println(System.nanoTime() - start);
        for (int[] re : res) {
            System.out.println(Arrays.toString(re));
        }
    }

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });
        LinkedList<int[]> queue = new LinkedList<>();
        for (int[] p : people) queue.add(p[1], p);
        return queue.toArray(new int[people.length][]);
    }
}

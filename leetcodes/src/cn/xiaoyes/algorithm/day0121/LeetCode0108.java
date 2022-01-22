package cn.xiaoyes.algorithm.day0121;

import java.util.LinkedList;
import java.util.List;

public class LeetCode0108 {
    public static void main(String[] args) {

    }
    public void setZeroes(int[][] matrix) {
        List<int[]> list = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0){
                    int[] temp = new int[2];
                    temp[0] = i;
                    temp[1] = j;
                    list.add(temp);
                }
            }
        }
        for (int[] arr : list){
            int row = arr[0];
            int col = arr[1];
            int[] rowArr = matrix[row];
            for (int i = 0; i < rowArr.length; i++) {
                rowArr[i] = 0;
            }
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }
    }
}

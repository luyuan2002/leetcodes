package cn.lanqiao.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 杨辉三角
 * @author Administrator
 *
 */
public class Simple02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int numRows = n;
		List<List<Integer>> triangle = new ArrayList<>();
		List<Integer> res = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            List<Integer> numbers = new ArrayList<>();
            for (int column = 0; column <= row; column++) {
                if (column == 0 || column == row) {
                    numbers.add(1);
                } else {
                    numbers.add(triangle.get(row - 1).get(column - 1) + triangle.get(row - 1).get(column));
                }
                res.add(numbers.get(column));
            }
            triangle.add(numbers);
        }
        for (int i = 0; i < res.size(); i++) {
        	if(res.get(i) == n) {
        		System.out.println(i + 1);
                break;
        	}
		}
	}

}

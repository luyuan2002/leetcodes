package cn.xiaoyes.algorithm.day0306;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LanQiao544 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int t = sc.nextInt();
		List<Character> list = new ArrayList<>();
		char[] words = word.toCharArray();
		for (char c : words) list.add(c);
		for (int i = 0; i < t; i++) {
			if(list.get(0) > list.get(1)) {
				list.remove(0);
			}else {
				list.remove(1);
			}
		}
		for (char c : list) {
			System.out.print(c);
		}
		sc.close();
	}

}

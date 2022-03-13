package cn.xiaoyes.algorithm.day0313;

import java.util.Scanner;

public class LanQiao1461 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int weight = 1;
		int count = 1;
		int total = 1;
		while(total < n) {
			count++;
			weight *= 3;
			total += weight;
		}
		System.out.println(count);
		sc.close();

	}

}

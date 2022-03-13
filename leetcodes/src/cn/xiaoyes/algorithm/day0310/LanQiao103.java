package cn.xiaoyes.algorithm.day0310;

import java.util.Scanner;

public class LanQiao103 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		System.out.println(s);
		String[] times = s.split("/");
		System.out.println("20" + times[0] + "-" + times[1] + "-" + times[2]);
		System.out.println("20" + times[2] + "-" + times[0] + "-" + times[1]);
		System.out.println("20" + times[2] + "-" + times[1] + "-" + times[0]);
		sc.close();
	}

}

package cn.lanqiao.simple;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 格式化日期
 */
public class Simple03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextInt();
		Date date = new Date(t);
		SimpleDateFormat format = new SimpleDateFormat("HH:MM:SS");
		System.out.println(format.format(date));
		sc.close();
	}
}

package cn.xiaoyes.algorithm.day0316;

import java.util.Scanner;

public class LanQiao541 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();
		boolean f = true;
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			if(d < 1 || d > 31) {
				f = false;
			}
		} else if (m == 4 || m == 6 || m == 9 || m == 11) {
			if(d < 1 || d > 30) {
				f = false;
			}
		}else if(m == 2){
			if(d < 1 || d > 28) {
				f = false;
			}
		} 
		if (f) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		sc.close();
	}

}

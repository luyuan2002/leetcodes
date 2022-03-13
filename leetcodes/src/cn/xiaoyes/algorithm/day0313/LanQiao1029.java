package cn.xiaoyes.algorithm.day0313;

import java.util.Scanner;

public class LanQiao1029 {

	public static void main(String[] args) {
		String[] tg = {"jia","yi","bing","ding","wu","ji","geng","xin","ren","gui"};
		String[] dz = {"zi","chou","yin","mao","chen","si","wu","wei","shen","you","xu","hai"};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int a=(n-3)%10;
	    if(a==0)a=10;
	    int b=(n-3)%12;
	    if(b==0)b=12;
	    System.out.print(tg[a-1]);
	    System.out.println(dz[b-1]);
		sc.close();
	}

}

package cn.lanqiao.cp.Lan;

import java.util.Scanner;

public class demo4 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	long sum=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			sum+=arr[i]*arr[j];
		}
	}
	System.out.println(sum);
}
}

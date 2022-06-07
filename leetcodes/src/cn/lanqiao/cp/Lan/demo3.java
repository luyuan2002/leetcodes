package cn.lanqiao.cp.Lan;


import java.util.Scanner;

public class demo3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s=scan.next();
	int n=Integer.valueOf(s.substring(1));
	int[] chang=new int[10];
	int[] kuan=new int[10];
	chang[0]=1189;
	kuan[0]=841;
	for(int i=1;i<chang.length;i++) {
		chang[i]=kuan[i-1];
		kuan[i]=chang[i-1]/2;
	}
	System.out.println(chang[n]);
	System.out.println(kuan[n]);
}
}

package cn.lanqiao.cp.Lan;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
	String s="WHERETHEREISAWILLTHEREISAWAY";
	char[] c=s.toCharArray();
	Arrays.sort(c);
	String s1=String.valueOf(c);
	System.out.println(s1);
}
}

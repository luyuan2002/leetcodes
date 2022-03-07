package cn.xiaoyes.algorithm.day0307;

import java.util.Scanner;

public class LanQiao543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length -1; i++) {
			if(nums[i + 1] - nums[i] > max) {
				max = nums[i + 1] - nums[i];
			}
		}
		System.out.println(max);
		sc.close();
	}

}

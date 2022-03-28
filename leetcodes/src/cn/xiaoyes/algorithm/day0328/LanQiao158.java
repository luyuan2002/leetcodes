package cn.xiaoyes.algorithm.day0328;

import java.util.Scanner;

/**
 * 
 * @author BPDBSIR
 *
 */
public class LanQiao158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		sc.close();
		// 最大长度
		int maxLen = 0;
		// 左坐标 右坐标
		int left = 0, right = 0;
		for (int i = 0; i < nums.length; i++) {
			// 当前最大长度
			int len = 0;
			for (int j = i + 1; j < nums.length; j++) {
				// 下一个元素大于当前元素
				if (nums[j - 1] > nums[j]) {
					break;
				} else {
					// 长度累加
					len++;
					// 当前长度是否大于最大长度
					if (len > maxLen) {
						// 记录i
						left = i;
						// 记录j
						right = j;
						// 记录最大长度
						maxLen = len;
					}
				}
			}
		}
		// right坐标 - left坐标 + 1
		System.out.println(right - left + 1);
	}

}

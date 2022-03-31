package cn.xiaoyes.algorithm.dya0331;

import java.util.Arrays;

/**
 * 三层循环代表三个不确定的值
 * @author BPDBSIR
 *
 */
public class LanQiao649 {

	public static void main(String[] args) {
		// 第一个不确定的值为四位数 所以循环的区间为[1000,10000)
		for (int i = 1000; i < 10000; i++) {
			// 第二个不确定的值为四位数 所以循环的区间为[1000,10000)
			for (int j = 1000; j < 10000; j++) {
				// 第三个不确定的值为两位数 所以循环区间为[10,100)
				for (int k = 10; k < 100; k++) {
					// 首先判断结果是否等于900
					if((i - j) * k == 900) {
						// 进行字符串的拼接 在转换为Char数组 并排序
						char[] cs = String.valueOf(String.valueOf(i) + String.valueOf(j) + String.valueOf(k)).toCharArray();
						Arrays.sort(cs);
						String t = new String(cs);
						// 如果排序后的结果正好是0123456789组成的字符串 表示此结果有效
						if(t.equals("0123456789")) {
							// 输出
							System.out.println("(" + i + "-" + j + ")*" + k + "=" + (i - j) * k);
						}
					}
				}
			}
		}
	}

}

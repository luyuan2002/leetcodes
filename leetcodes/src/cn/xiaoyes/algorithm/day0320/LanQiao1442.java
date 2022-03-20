package cn.xiaoyes.algorithm.day0320;

/**
 * 暴力循环
 * 判断是否包含"2" "0" "1" "9"如果包含就累加
 * @author BPDBSIR
 *
 */
public class LanQiao1442 {

	public static void main(String[] args) {
		// 2 0 1 9 
		int sum = 0;
		for (int i = 1; i <= 2019; i++) {
			String s = String.valueOf(i);
			if(s.contains("2") || s.contains("0") || s.contains("1") || s.contains("9")) {
				sum += i;
			}
		}
		System.out.println(sum);
		
	}

}

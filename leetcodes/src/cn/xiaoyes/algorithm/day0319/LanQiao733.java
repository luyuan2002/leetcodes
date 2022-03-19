package cn.xiaoyes.algorithm.day0319;

/**
 * 循环判断
 * 10989 * 9 = 98901
 * 21978 * 4 = 87912 Pass
 * 109989 * 9 = 989901
 * 219978 * 4 = 879912
 * @author BPDBSIR
 *
 */
public class LanQiao733 {

	public static void main(String[] args) {
		// A B C D E * ? = E D C B A
		int n = 10000;
		while(true) {
			int i = 2;
			while(i < 200) {
				int a = Integer.valueOf(new StringBuffer(n + "").reverse().toString());
				if(n * i == a) {
					System.out.println(n + " * " + i + " = " + a);
					break;
				}
				i++;
			}
			n++;
		}
	}

}

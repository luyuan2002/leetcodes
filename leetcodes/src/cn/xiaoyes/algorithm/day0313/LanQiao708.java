package cn.xiaoyes.algorithm.day0313;

/**
 * 死循环 跳出条件为字符串的长度==1 使用标记法将每次的偶数位置字符串替换为'z' 再一次遍历素有字符串查找当前位置如果是'z'就删除当前字符 直到字符串的长度为1的时候跳出 此时字符串就为此题的答案
 * @author BPDBSIR
 *
 */
public class LanQiao708 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 106; i++) {
			sb.append("abcdefghijklnmopqls");
		}
		while(true) {
			if(sb.length() == 1) {
				break;
			}
			for (int i = 0; i < sb.length(); i+=2) {
				sb.replace(i, i + 1, "z");
			}
			for (int i = 0; i < sb.length(); i++) {
				if(sb.charAt(i) == 'z') {
					sb.deleteCharAt(i);
				}
			}
		}
		System.out.println(sb);
	}

}

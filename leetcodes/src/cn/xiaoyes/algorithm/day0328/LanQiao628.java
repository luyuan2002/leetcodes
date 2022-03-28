package cn.xiaoyes.algorithm.day0328;

/**
 * S 夫人一向很神秘。这会儿有人问起她的年龄，她想了想说： "20 年前，我丈夫的年龄刚好是我的 2 倍， 而现在他的年龄刚好是我的 1.5 倍"。
 * 你能算出 S 夫人现在的年龄吗？
 * 
 * @author BPDBSIR
 *
 */
public class LanQiao628 {

	public static void main(String[] args) {
		// 二十年前
		for (int i = 20; i < 100; i++) {
			// 现在
			for (int j = 20; j < 100; j++) {
				// 二十年前是两倍						  并且现在是1.5倍
				if (((i - 20) * 2 == (j - 20)) && ((float) j / i == 1.5)) {
					System.out.println(i);
				}
			}
		}
	}

}

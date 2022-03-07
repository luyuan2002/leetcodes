package cn.xiaoyes.algorithm.day0307;


/**
 * 拆分为字符数组 对相应的字符进行长度累加
 * @author BPDBSIR
 *
 */
public class LanQiao648 {

	public static void main(String[] args) {
		String s ="|                                                 |"
				+ "|    H######                      ####            |"
				+ "|          #                      #  #            |"
				+ "|          #                      #  #            |"
				+ "|          #     ####             #  #            |"
				+ "|          #     #  #             #  #            |"
				+ "|          ######@###             #  #            |"
				+ "|                #       ####     #  #            |"
				+ "|                #       #  #     #  #            |"
				+ "|            ####@#######@###     #  #            |"
				+ "|            #   #       #        #  #            |"
				+ "| T          #####       #        #  #   ##       |"
				+ "| #                      #      ###  ### ##       |"
				+ "| ################       #      #      ####       |"
				+ "|                #       #      #         #       |"
				+ "|   ##############       #######@##########       |"
				+ "|   #                         ###                 |"
				+ "|   ###########################                   |";
		char[] array = s.toCharArray();
		int n = 0;
		for (char c : array) {
			if(c == '#') {
				n +=1;
			}else if(c == '@') {
				n += 2;
			}else if(c == 'T' || c == 'H') {
				n += 1;
			}
		}
		System.out.println(n);
	}

}

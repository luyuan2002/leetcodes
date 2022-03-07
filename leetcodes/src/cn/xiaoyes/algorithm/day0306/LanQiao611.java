package cn.xiaoyes.algorithm.day0306;


public class LanQiao611 {

	public static void main(String[] args) {
//		int startYear = 1901;
//		int startMonth = 1;
//		int startDay = 1;
//		int endYear = 2000;
//		int endMonth = 12;
//		int endDay = 31;
//		int res = 0;
//		int n = 0;
//		for (int i = startYear; i <= endYear; i++) {
//			for (int j = startMonth; j <= endMonth; j++) {
//				int day = endDay;
//				if(j == 2) {
//					if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
//						day = 28;
//					}else {
//						day = 29;
//					}
//				}else if(j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12) { // 1 3 5 7 8 10 12
//					day = 31;
//				}else {
//					day = 30;
//				}
//				for (int k = startDay; k <= day; k++) {
//					if(n == 7) {
//						res++;
//						n = 0;
//					}
//					n++;
//				}
//			}
//		}
//		System.out.println(res);
		int n = 0;
		for (int i = 1901; i <= 2000; i++) {
			if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) n += 366; else n += 365;
		}
		System.out.println(n);
		System.out.println(n / 7);
	}

}

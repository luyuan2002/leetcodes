package cn.xiaoyes.algorithm.day0307;

public class LanQiao730 {

	public static void main(String[] args) {
		int n = 100002;
		int i = 1;
		while (n > 0) {
			if(isPrime(i)) {
				n--;	
			}
			i++;
		}
		System.out.println(i);
	}

	public static boolean isPrime(int n) {
//		if (n < 2)
//			return false;
//		for (int i = 2; i < n; ++i)
//			if (n % i == 0)
//				return false;
//		return true;
	    int m = 0;
	    for (int i = 2; i < n ; i++) {
	        if(n % i==0)
	            m++;
	    }
	    if (m == 0)
	    	return true;
	    else
	    	return false;
	}
}

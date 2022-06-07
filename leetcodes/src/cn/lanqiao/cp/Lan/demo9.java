package cn.lanqiao.cp.Lan;

import java.math.BigInteger;
import java.util.Scanner;

public class demo9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long l = scan.nextLong();
        BigInteger b = new BigInteger("0");
        for (long i = 1; i <= l; i++) {
            if (l % i == 0) {
                BigInteger b1 = new BigInteger("" + i);
                b1 = b1.multiply(b1);
                b = b.add(b1);
            }
        }
        BigInteger re[] = b.divideAndRemainder(new BigInteger("1000000007"));
        System.out.println(re[1]);
    }
}

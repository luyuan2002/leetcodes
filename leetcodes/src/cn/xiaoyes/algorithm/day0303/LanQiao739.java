package cn.xiaoyes.algorithm.day0303;

import java.math.BigInteger;

public class LanQiao739 {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.valueOf(1);
        BigInteger add = BigInteger.valueOf(1);
        BigInteger mul = BigInteger.valueOf(2);
        for (int i = 0; i < 63; i++) {
            add = add.multiply(mul);
            sum = sum.add(add);
        }
        System.out.println(sum);
    }
}

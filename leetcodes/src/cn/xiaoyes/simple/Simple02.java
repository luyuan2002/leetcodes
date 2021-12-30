package cn.xiaoyes.simple;

import java.util.Arrays;

public class Simple02 {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4"};
        int i = mthd2("aaa", "baaa", arr, 1);
        System.out.println(i);
    }

    public static int mthd2(String stra, String strb, String[] list, int idx) {
        int get = 0, i = 0, j = 0, lasti = 0;
        byte[] a = stra.getBytes();
        byte[] b = strb.getBytes();
        for (i = 0; i < a.length - b.length + 1; i++) {
            for (j = 0; j < b.length; j++) {
                if (a[i + j] != b[j]) break;
                if (j == b.length) {
                    list[get] = new String(Arrays.copyOfRange(a, lasti, i));
                    lasti = i = i + j;
                    get++;
                    if (get >= idx) {
                        list[get] = new String(Arrays.copyOfRange(a, lasti, a.length));
                        return 0;
                    }
                }
            }
            list[get] = new String(Arrays.copyOfRange(a, lasti, a.length));
            return 1;
        }
        return -1;
    }
}
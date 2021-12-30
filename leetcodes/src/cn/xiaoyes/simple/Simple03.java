package cn.xiaoyes.simple;

public class Simple03 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,4,4};
        int mthd = mthd(arr, 3);
        System.out.println(mthd);
    }

    public static int mthd(int[] a, int tar) {
        for (int step = a.length / 2; step > 0; step = step / 2) {
            for (int i = step; i < a.length; i++) {
                for (int j = i - step; j >= 0; j = j - step) {
                    if (a[j] > a[j + step]) {
                        a[j] = a[j] + a[j + step];
                        a[j + step] = a[j] - a[j + step];
                        a[j] = a[j] - a[j + step];
                    }
                }
            }
        }
        int tmp = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == tar) tmp = i;
        }
        return tmp;
    }
}
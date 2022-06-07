package cn.lanqiao.cp.Lan;

import java.util.Scanner;

public class demo10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int a = 0, b = 0, count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int s = arr[i], m = 0, index = 0;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    m = arr[j];
                    index++;
                    break;
                } else {
                    index++;
                }
            }
            if (index > count) {
                a = s;
                b = m;
                count = index;
            }
        }
        System.out.println(a + " " + b);
    }
}

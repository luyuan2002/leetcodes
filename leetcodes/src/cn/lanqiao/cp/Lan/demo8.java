package cn.lanqiao.cp.Lan;

import java.util.Scanner;

public class demo8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int[] arr = new int[n - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 2 * x) {
                arr[i] = 0;
            }
        }
        int index = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            } else {
                if (count > index) {
                    count++;
                    index = count;
                    count = 1;
                }
            }
            if (i == arr.length - 1 && arr[i] == 0) {
                if (count > index) {
                    index = count;
                }
            }
        }
        if (index <= 1) {
            index = n - 1;
        }
        System.out.println(index);
    }
}

package cn.lanqiao.cp.Lan;

import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int x = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int[][] arr1 = new int[m][2];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (f1(arr1[i][0], arr1[i][1], x)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static boolean f1(int n, int m, int x) {
        for (int i = n; i <= m; i++) {
            for (int j = i + 1; j <= m; j++) {
                if (f(i, j, x)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(int n, int m, int x) {
        int a = n ^ m;
        if (a == x) {
            return true;
        }
        return false;
    }
}

package cn.lanqiao.cp.Lan;

import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[][] arr = new int[t][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int a1 = arr[i][0], a2 = arr[i][1];
            int b1 = arr[i][2], b2 = arr[i][3];
            int c1 = arr[i][4], c2 = arr[i][5];
            if (
                    (a1 == b1 + c1 && b2 == c2) || (a1 == b2 + c2 && b1 == c1) ||
                            (a1 == b1 + c2 && b2 == c1) || (a1 == b2 + c1 && b1 == c2) ||
                            (a2 == b1 + c1 && b2 == c2) || (a2 == b2 + c2 && b1 == c1) ||
                            (a2 == b1 + c2 && b2 == c1) || (a2 == b2 + c1 && b1 == c2) ||
                            (b1 == a1 + c1 && a2 == c2) || (b1 == a2 + c2 && a1 == c1) ||
                            (b1 == a1 + c2 && a2 == c1) || (b1 == a2 + c1 && a1 == c2) ||
                            (b2 == a1 + c1 && a2 == c2) || (b2 == a2 + c2 && a1 == c1) ||
                            (b2 == a1 + c2 && a2 == c1) || (b2 == a2 + c1 && a1 == c2) ||
                            (c1 == a1 + b1 && a2 == b2) || (c1 == a2 + b2 && a1 == b1) ||
                            (c1 == a1 + b2 && a2 == b1) || (c1 == a2 + b1 && a1 == b2) ||
                            (c2 == a1 + b1 && a2 == b2) || (c2 == a2 + b2 && a1 == b1) ||
                            (c2 == a1 + b2 && a2 == b1) || (c2 == a2 + b1 && a1 == b2)
            ) {
                System.out.println(4);
            } else if (
                    (a1 != b1 + c1 && b2 != c2) && (a1 != b2 + c2 && b1 != c1) &&
                            (a1 != b1 + c2 && b2 != c1) && (a1 != b2 + c1 && b1 != c2) &&
                            (a2 != b1 + c1 && b2 != c2) && (a2 != b2 + c2 && b1 != c1) &&
                            (a2 != b1 + c2 && b2 != c1) && (a2 != b2 + c1 && b1 != c2) &&
                            (b1 != a1 + c1 && a2 != c2) && (b1 != a2 + c2 && a1 != c1) &&
                            (b1 != a1 + c2 && a2 != c1) && (b1 != a2 + c1 && a1 != c2) &&
                            (b2 != a1 + c1 && a2 != c2) && (b2 != a2 + c2 && a1 != c1) &&
                            (b2 != a1 + c2 && a2 != c1) && (b2 != a2 + c1 && a1 != c2) &&
                            (c1 != a1 + b1 && a2 != b2) && (c1 != a2 + b2 && a1 != b1) &&
                            (c1 != a1 + b2 && a2 != b1) && (c1 != a2 + b1 && a1 != b2) &&
                            (c2 != a1 + b1 && a2 != b2) && (c2 != a2 + b2 && a1 != b1) &&
                            (c2 != a1 + b2 && a2 != b1) && (c2 != a2 + b1 && a1 != b2)
            ) {
                System.out.println(8);
            } else {
                System.out.println(6);
            }
        }
    }
}

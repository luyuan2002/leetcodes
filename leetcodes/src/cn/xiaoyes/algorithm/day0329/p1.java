package cn.xiaoyes.algorithm.day0329;


import java.util.ArrayList;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner c1 = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = c1.nextInt();
            }
        }
        ArrayList<ArrayList<Integer>> link = new ArrayList<>();
        for (int[] ints : arr) {
            ArrayList<Integer> obj = new ArrayList<>();
            for (int anInt : ints) obj.add(anInt);
            link.add(obj);
        }

        boolean isok = true;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                heng(arr, j);
                shu(arr, j);
            }
            zxie(arr);
            //右斜
            int num = 0;
            int max = 15;
            for (int j = 0; j < 3; j++) {
                if (arr[j][2 - j] != 0) {
                    num++;
                }
                max -= arr[j][2 - j];
            }
            if (num == 2) {
                for (int j = 0; j < 3; j++) {
                    if (arr[j][2 - j] == 0) {
                        arr[j][2 - j] = max;
                    }
                }
            }
            //
            if (i == 0) {
                boolean ok = true;
                for (int h = 0; h < link.size(); h++) {
                    for (int j = 0; j < link.get(h).size(); j++) {
                        if (link.get(h).get(j) != arr[h][j]) {
                            ok = false;
                            break;
                        }
                    }
                    if (!ok) break;
                }
                if (ok) isok = false;
            }
            if (!isok) {
                break;
            }
        }
        if (isok) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (j != arr.length - 1) {
                        System.out.print(arr[i][j] + " ");
                    }else {
                        System.out.print(arr[i][j]);
                    }
                }
                if (i != arr.length - 1) {
                    System.out.println();
                }
            }
        } else {
            System.out.println("TooMany");
        }
    }

    //左斜判断
    private static void zxie(int[][] arr) {
        int num = 0;
        int max = 15;
        for (int j = 0; j < 3; j++) {
            if (arr[j][j] != 0) {
                num++;
            }
            max -= arr[j][j];
        }
        if (num == 2) {
            for (int j = 0; j < 3; j++) {
                if (arr[j][j] == 0) {
                    arr[j][j] = max;
                }
            }
        }
    }

    //横判断
    public static void heng(int[][] arr, int low) {
        int num = 0;
        int max = 15;
        for (int j = 0; j < 3; j++) {
            if (arr[low][j] != 0) {
                num++;
            }
            max -= arr[low][j];
        }
        if (num == 2) {
            for (int j = 0; j < 3; j++) {
                if (arr[low][j] == 0) {
                    arr[low][j] = max;
                }
            }
        }
    }

    //竖判断
    public static void shu(int[][] arr, int low) {
        int num = 0;
        int max = 15;
        for (int j = 0; j < 3; j++) {
            if (arr[j][low] != 0) {
                num++;
            }
            max -= arr[j][low];
        }
        if (num == 2) {
            for (int j = 0; j < 3; j++) {
                if (arr[j][low] == 0) {
                    arr[j][low] = max;
                }
            }
        }
    }
}

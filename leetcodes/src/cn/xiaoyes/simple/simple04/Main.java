package cn.xiaoyes.simple.simple04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String[] data1 = line1.split(" ");
        String[] data2 = line2.split(" ");
        int n = Integer.parseInt(data1[0]);
        int l = Integer.parseInt(data1[1]);
        int x = Integer.parseInt(data2[0]);
        int y = Integer.parseInt(data2[1]);
        int z = Integer.parseInt(data2[2]);
        long[] list = new long[n];
        for (int i = 0; i < list.length; i++) {
            int num = i + 1;
            if (num % (x * y * z) == 0)
                list[i] = 5;
            else if (num % (x * y) == 0 || num % (x * z) == 0 || num % (z * y) == 0)
                list[i] = 3;
            else if (num % x == 0 || num % y == 0 || num % z == 0)
                list[i] = 1;
        }
        int resp = 0;
        for (int i = 0; i < list.length - l; i++) {
            int sum = 0;
            for (int j = i; j < i + l; j++) {
                sum += list[j];
            }
            resp = Math.max(resp, sum);
        }
        System.out.println(resp);
    }
}

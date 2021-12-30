package cn.xiaoyes.simple.simple02;

//public class Main {
//    public static void main(String[] args) {
//        // 人数
//        int n = 4;
//        String[][] data = {
//                {"L", "G", "C", "U", "7"},
//                {"L", "Y", "C", "N", "3"},
//                {"T", "G", "E", "N", "1"},
//                {"T", "R", "C", "N", "0"},
//        };
//        // 通过数量
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            boolean flag1 = data[i][1].equals("G") && data[i][0].equals("L") && data[i][3].equals("C");
//            boolean flag2 = data[i][1].equals("G") && Integer.parseInt(data[i][4]) < 2;
//            if (flag1 || flag2){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yc = 0;
        int rc = 0;
        Scanner scanner = new Scanner(System.in);
        int persons = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < persons; i++) {
            String line = scanner.nextLine();
            String[] arr = line.split(" ");
            char type = arr[0].charAt(0);
            char color = arr[1].charAt(0);
            char vaccines = arr[2].charAt(0);
            char result = arr[3].charAt(0);
            int time = Integer.parseInt(arr[4]);
            if (type == 'T' && (color == 'Y' || (vaccines == 'E' && time >= 3)))
                yc++;
            if (color == 'R' || result == 'P')
                rc++;
        }
        System.out.println(yc + " " + rc);
    }
}
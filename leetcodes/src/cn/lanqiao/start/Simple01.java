package cn.lanqiao.start;

/**
 * 排列字母
 */
public class Simple01 {
    public static void main(String[] args) {
        String s = "WHERETHEREISAWILLTHEREISAWAY";
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    char a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        for (char c : arr) {
            System.out.print(c);
        }
    }
}

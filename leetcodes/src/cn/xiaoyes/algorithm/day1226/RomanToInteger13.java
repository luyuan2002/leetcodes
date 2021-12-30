package cn.xiaoyes.algorithm.day1226;

public class RomanToInteger13 {
    public static void main(String[] args) {
        int sum = romanToInt("LVIII");
        System.out.println(sum);
    }

    public static int romanToInt(String s) {
        char[] array = s.toCharArray();
        int sum = 0;
        int pre = getValue(array[0]);
        for (int i = 1; i < array.length; i++) {
            int value = getValue(array[i]);
            if (pre < value){
                sum -= pre;
            }else {
                sum += pre;
            }
            pre = value;
        }
        sum += pre;
        return sum;
    }

    private static int getValue(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}

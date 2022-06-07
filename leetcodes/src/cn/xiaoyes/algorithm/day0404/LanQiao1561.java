package cn.xiaoyes.algorithm.day0404;

public class LanQiao1561 {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 1; i <= 20210605 ; i++) {
            int j = i;
            while (j != 0){
                if (!f(j % 10)){
                    break;
                }
                j /= 10;
            }
            if (j == 0 && f(i)){
                res++;
            }
        }
        System.out.println(res);
    }

    /**
     * 判断是否为质数(正整数、1和它本身两个约数)
     * @param n
     * @return
     */
    public static boolean f(int n){
        if(n == 1 || n == 0){
            return false;
        }
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

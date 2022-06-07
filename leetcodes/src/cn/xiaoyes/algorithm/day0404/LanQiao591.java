package cn.xiaoyes.algorithm.day0404;

import java.util.HashSet;
import java.util.Set;

public class LanQiao591 {

    static Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        char[] arr = {'L','A','N','Q','I','A','O'};
        f(arr,0);
        System.out.println(set.size());
    }
    public static void f(char[] arr,int k){
        if (k == arr.length){
            set.add(new String(arr));
        }
        for (int i = k; i < arr.length; i++) {
            char c = arr[i];
            arr[i] = arr[k];
            arr[k] = c;
            f(arr,k + 1);
            c = arr[i];
            arr[i] = arr[k];
            arr[k] = c;
        }
    }
}

package cn.xiaoyes.algorithm.day0302;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        List<String> res = new ArrayList<>();
        func(arr,0,new StringBuilder(),res);
        System.out.println(res);
        System.out.println(res.size());
    }

    public static void func(char[] arr, int begin, StringBuilder sb,List<String> res) {
        if (begin == arr.length){
            res.add(sb.toString());
            return;
        }
        for (int i = begin; i < arr.length; i++) {
            sb.append(arr[i]);
            func(arr,i + 1,sb,res);
            sb.deleteCharAt(sb.length() - 1);;
        }
    }
}

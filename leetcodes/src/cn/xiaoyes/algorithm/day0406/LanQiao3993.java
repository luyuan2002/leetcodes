package cn.xiaoyes.algorithm.day0406;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class LanQiao3993 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Element> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String p = sc.next();
            String[] str = p.split(" ");
            String order = str[0];
            String city = str[1];
            map.put(city,new Element(order,1));
        }
        sc.close();
        map.forEach(new BiConsumer<String, Element>() {
            @Override
            public void accept(String s, Element element) {
                System.out.println(s + " => " + element.toString());
            }
        });
    }
    static class Element{

        String order;

        int size;

        public Element(){

        }

        public Element(String order, int size) {
            this.order = order;
            this.size = size;
        }

        @Override
        public String toString() {
            return "Element{" +
                    "order='" + order + '\'' +
                    ", size=" + size +
                    '}';
        }
    }
}

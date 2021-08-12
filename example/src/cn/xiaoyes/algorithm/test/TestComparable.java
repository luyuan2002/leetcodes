package cn.xiaoyes.algorithm.test;

import cn.xiaoyes.algorithm.sort.Student;

/***
 * 定义测试类。编写测试方法Comparable getMax(Comparable c1,Comparable c2)完成测试
 */
@SuppressWarnings("all")
public class TestComparable {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setUsername("张三");
        s1.setAge(19);
        Student s2 = new Student();
        s2.setUsername("李四");
        s2.setAge(20);
        Comparable comparable = getMax(s1, s2);
        System.out.println(comparable.toString());
    }
    public static Comparable getMax(Comparable c1,Comparable c2){
        int result = c1.compareTo(c2);
        // 如果result小于0则c1比c2小 如果result大于0则c1比c2大
        // 如果result等于0则c1和c2一样大
        if (result >= 0)
            return c1;
        else return c2;
    }
}

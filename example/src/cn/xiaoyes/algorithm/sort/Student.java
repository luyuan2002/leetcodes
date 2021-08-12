package cn.xiaoyes.algorithm.sort;

/**
 * 定义一个学生类，具有年龄age和姓名username两个属性，并提供Comparable提供比较规则
 */
public class Student implements Comparable<Student>{

    private String username;

    private int age;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }
}

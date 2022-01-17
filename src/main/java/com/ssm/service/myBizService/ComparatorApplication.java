package com.ssm.service.myBizService;

public class ComparatorApplication {
    public static void main(String[] args)
    {
        Person p1 = new Person(1, "xy1", 22);
        Person p2 = new Person(2, "xy1", 21);
        System.out.println("实现Comparable接口方法结果(按年龄比较)："); // 结果为1
        System.out.println(p1.compareTo(p2));

        System.out.println("实现Comparator接口方法结果(按学号比较)："); // 结果为-1
        PersonComparator pc = new PersonComparator();
        System.out.println(pc.compare(p1, p2));

// 也可用声明一个Person[] ps，通过Array.sort(ps)进行排序
    }
}

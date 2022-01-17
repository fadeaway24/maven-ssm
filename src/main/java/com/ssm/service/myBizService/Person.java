package com.ssm.service.myBizService;


// 实现Comparable接口
public class Person implements Comparable<Object>
{
    private int num;
    private String name;
    private int age;

    public Person(int num, String name, int age)
    {
        super();
        this.num = num;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Object o)
    {
        return this.age - ((Person) o).getAge();
    }

    public int getNum()
    {
        return num;
    }

    public void setNum(int num)
    {
        this.num = num;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}


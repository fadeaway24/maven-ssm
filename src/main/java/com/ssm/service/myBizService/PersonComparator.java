package com.ssm.service.myBizService;

import java.util.Comparator;

// 实现Comparator接口
public class PersonComparator implements Comparator<Object>
{
    @Override
    public int compare(Object o1, Object o2)
    {
        int num1 = ((Person) o1).getNum();
        int num2 = ((Person) o2).getNum();
        return num1 > num2 ? 1 : (num1 == num2 ? 0 : -1);
    }
}



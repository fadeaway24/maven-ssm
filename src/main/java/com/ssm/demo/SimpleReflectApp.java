package com.ssm.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class SimpleReflectApp {

    public static void main(String[] args) {
        try {
            Class c = Class.forName("java.lang.String");
            // 取得包代表对象
            Package p = c.getPackage();
            System.out.printf("package %s;%n", p.getName());
            // 取得类型修饰，像是class、interface
            int m = c.getModifiers();

            System.out.print(Modifier.toString(m) + " ");
            // 如果是接口
            if(Modifier.isInterface(m)) {
                System.out.print("interface ");
            }
            else {
                System.out.print("class ");
            }

            System.out.println(c.getName() + " {");

            // 取得声明的域成员代表对象
            Field[] fields = c.getDeclaredFields();
            for(Field field : fields) {
                // 显示权限修饰，像是public、protected、private
                System.out.print("\t" +
                        Modifier.toString(field.getModifiers()));
                // 显示类型名称
                System.out.print(" " +
                        field.getType().getName() + " ");
                // 显示域成员名称
                System.out.println(field.getName() + ";");
            }

            // 取得声明的构造函数代表对象
            Constructor[] constructors =
                    c.getDeclaredConstructors();
            for(Constructor constructor : constructors) {
                // 显示权限修饰，像是public、protected、private
                System.out.print("\t" +
                        Modifier.toString(
                                constructor.getModifiers()));
                // 显示构造函数名称
                System.out.println(" " +
                        constructor.getName() + "();");
            }
            // 取得声明的方法成员代表对象
            Method[] methods = c.getDeclaredMethods();
            for(Method method : methods) {
                // 显示权限修饰，像是public、protected、private
                System.out.print("\t" +
                        Modifier.toString(
                                method.getModifiers()));
                // 显示返回值类型名称
                System.out.print(" " +
                        method.getReturnType().getName() + " ");
                // 显示方法名称
                System.out.println(method.getName() + "();");
            }
            System.out.println("}");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("没有指定类");
        }
        catch(ClassNotFoundException e) {
            System.out.println("找不到指定类");
        }
    }

}

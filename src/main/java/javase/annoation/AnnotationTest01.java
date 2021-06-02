package javase.annoation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @program: book-java-for-demo
 * @description: 测试
 * @author: kmmshmily--cuiyong
 * @date: 2021-05-27 18:09
 **/

public class AnnotationTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("javase.annoation.Student");
        System.out.println(c1);
        //1、打印本类及父类的public 字段
        Field[] f1 = c1.getFields();
        for(Field field : f1){
            System.out.println(field);
        }
        //2、打印本类的所有字段
        System.out.println("*****************");
        Field[] f2 = c1.getDeclaredFields();
        for(Field field : f2){
            System.out.println(field);
        }

        //3、打印本类及父类的public方法
        System.out.println("******************");
        Method[] m1 = c1.getMethods();
        for(Method m : m1){
            System.out.println(m);
        }
        System.out.println("******************");
        //4、打印本类所有方法
        Method[] m2 = c1.getDeclaredMethods();
        for(Method m : m2){
            System.out.println(m);
        }
    }
}   

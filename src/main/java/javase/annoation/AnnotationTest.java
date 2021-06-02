package javase.annoation;

import java.lang.reflect.Method;

/**
 * @program: book-java-for-demo
 * @description: 注解测试类
 * @author: kmmshmily--cuiyong
 * @date: 2021-05-25 17:07
 **/
//@Kmmshmily(value = "my name is class")
public class AnnotationTest {

//    @Kmmshmily(value = "my name is main method")
    public static void main(String[] args) throws Exception{
        Class<AnnotationTest> clazz = AnnotationTest.class;
//        Kmmshmily kmmshmily = clazz.getAnnotation(Kmmshmily.class);
//        System.out.println(kmmshmily.value());

        Method method = clazz.getDeclaredMethod("main", String[].class);
//        System.out.println(method.getAnnotation(Kmmshmily.class).value());
    }

    @Kmmshmily(value = "my name is test method")
    private static void test(String type){

    }

}   

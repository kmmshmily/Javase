package javase.annoation.blogstudy;

import javase.annoation.Kmmshmily;
import javase.annoation.Person;
import org.reflections.Reflections;

import java.util.Set;

/**
 * @program: book-java-for-demo
 * @description: 测试
 * @author: kmmshmily--cuiyong
 * @date: 2021-06-01 17:56
 **/

public class GuavaTest {
    public static void main(String[] args) throws Exception{

        //1、guava
        //入参 要扫描的包名
        Reflections f = new Reflections("javase.annoation");

        //入参 目标注解类
        Set<Class<?>> set = f.getTypesAnnotatedWith(Kmmshmily.class);
        System.out.println("..");
        set.stream().forEach(e -> {
            try {
                Person person = (Person)e.newInstance();
                person.setAge("26");
                person.setName("kmmshmily");
                person.setId("10111278");
                System.out.println(person);
            }catch (Exception e1){
                System.out.println(e1);
            }

        });

//        //2. 文件扫描情况
//        Set<Class<?>> set1 = new Scanner().getAnnotationClasses("javase.annoation", Kmmshmily.class);
//        System.out.println("..");
    }
}   

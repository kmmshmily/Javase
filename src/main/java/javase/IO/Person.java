package javase.IO;

import java.io.Serializable;

/**
 * @program: book-java-for-demo
 * @description: 人类
 * @author: kmmshmily--cuiyong
 * @date: 2020-08-11 22:32
 **/

public class Person implements Serializable {
    private String name;
    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

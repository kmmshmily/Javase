package javase.annoation;

/**
 * @program: book-java-for-demo
 * @description: 人
 * @author: kmmshmily--cuiyong
 * @date: 2021-05-27 18:05
 **/
@Kmmshmily
public class Person {
    public String name;
    public String age;
    private String id;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public Person(){

    }
    public Person(String name, String age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

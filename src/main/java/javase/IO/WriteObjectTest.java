package javase.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @program: book-java-for-demo
 * @description: 序列化
 * @author: kmmshmily--cuiyong
 * @date: 2020-08-11 22:33
 **/

public class WriteObjectTest {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\kmmshmily.txt"));

        Person person = new Person("崔勇", "25");
        oos.writeObject(person);
    }
}   

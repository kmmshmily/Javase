package javase.file;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: book-java-for-demo
 * @description: test
 * @author: kmmshmily--cuiyong
 * @date: 2020-06-09 21:51
 **/

public class ReadFromProcess {
    public static void main(String[] args) {
        try {
            Process p = Runtime.getRuntime().exec("javac");
            var br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String buff = null;
            while ((buff = br.readLine()) != null){
                System.out.println(buff);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}   

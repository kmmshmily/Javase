package javase.IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: book-java-for-demo
 * @description: 从进程读取
 * @author: kmmshmily--cuiyong
 * @date: 2020-08-11 21:52
 **/

public class ReadFromProcess {
    public static void main(String[] args) {
        try {
            Process p = Runtime.getRuntime().exec("cd");
            BufferedReader bd = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;

            while ((line = bd.readLine()) != null){
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}   

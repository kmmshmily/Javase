//package javase.file;
//
//import java.io.File;
//
///**
// * @program: book-java-for-demo
// * @description: 文件过滤器
// * @author: kmmshmily--cuiyong
// * @date: 2020-05-25 21:25
// **/
//
//public class FilenameFilterTest {
//    public static void main(String[] args) {
//        var file = new File(".");
//        String[] nameList = file.list((dir, name) -> name.endsWith(".java") || new File(name).isDirectory());
//        for(var name : nameList){
//            System.out.print(name +"、");
//        }
//    }
//}

package javase.standard;

/**
 * @program: book-java-for-demo
 * @description: test
 * @author: kmmshmily--cuiyong
 * @date: 2020-05-25 20:54
 **/

public class SwitchTest {
    public static void main(String[] args) {
        var season = "夏天";
        switch (season) {
            case "春天":
                System.out.println(season + " 春暖花开");
                break;
            case "夏天":
                System.out.println(season + " 夏日炎炎");
                break;
            default:
                System.out.println(">>>>");
        }
    }
}   

package javase.thread;

/**
 * @program: book-java-for-demo
 * @description: 同步
 * @author: kmmshmily--cuiyong
 * @date: 2020-07-15 22:25
 **/

public class SynTest {
    public static int count = 0;
    public static void incr(){
        try {
            Thread.sleep(1);
        }catch (Exception e){
            e.printStackTrace();
        }
        count++;
    }

    public static void main(String[] args) throws Exception{
        for(int i = 0; i < 1000; i++){
            new Thread(()->SynTest.incr()).start();
        }
        Thread.sleep(3000);

        System.out.println(count);
    }
}   

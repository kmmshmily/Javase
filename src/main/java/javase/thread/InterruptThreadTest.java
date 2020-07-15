package javase.thread;

import java.util.concurrent.TimeUnit;

/**
 * @program: book-java-for-demo
 * @description: 线程中断
 * @author: kmmshmily--cuiyong
 * @date: 2020-07-13 23:01
 **/

public class InterruptThreadTest implements Runnable{
    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            System.out.println("..........");
            try {
                System.out.println("前"+Thread.currentThread().isInterrupted());
                TimeUnit.SECONDS.sleep(3);
                System.out.println("后"+Thread.currentThread().isInterrupted());
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("异常后"+Thread.currentThread().isInterrupted());
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("循环后"+Thread.currentThread().isInterrupted());
        System.out.println("processor end!");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new InterruptThreadTest(), "kmmshmily");
        t1.start();
        Thread.sleep(1000);
        t1.interrupt();
    }
}

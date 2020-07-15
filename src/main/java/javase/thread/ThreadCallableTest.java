package javase.thread;

import java.util.concurrent.*;

/**
 * @program: book-java-for-demo
 * @description: 线程测试类
 * @author: kmmshmily--cuiyong
 * @date: 2020-07-09 13:05
 **/

public class ThreadCallableTest implements Callable<Integer> {

    public static void main(String[] args) {
        ThreadCallableTest task = new ThreadCallableTest();
        FutureTask futureTask = new FutureTask(task);
        Thread thread = new Thread(futureTask);
        thread.start();

        ExecutorService executor = Executors.newSingleThreadExecutor();
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
        try {
            Thread.sleep(1000);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        executor.shutdownNow();
        System.out.println("主线程在执行任务");

        try {
            System.out.println("task运行结果"+futureTask.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("所有任务执行完毕");
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("子线程在进行计算");
        Thread.sleep(3000);
        int sum = 0;
        for(int i=0;i<100;i++){
            sum += i;
        }
        return sum;
    }
}

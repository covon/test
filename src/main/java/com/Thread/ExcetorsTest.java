package com.Thread;

import org.junit.Test;

import java.util.concurrent.*;

/*
 * 功能描述:
 * Author: zgdz.xf
 * Date: 2022/04/26/上午 10:21
 **/
public class ExcetorsTest {
    CountDownLatch countDownLatch=new CountDownLatch(10);

    @Test
    public void singleExcetors() throws InterruptedException {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        singleThreadExecutor.awaitTermination(1,TimeUnit.MICROSECONDS);
        singleThreadExecutor.execute(new Mythread());

    }

    @Test
    public void fixExecutors() throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        executorService.awaitTermination(1,TimeUnit.MICROSECONDS);
        for (int i = 0; i < 20; i++) {
            executorService.execute(new Mythread());
        }
        countDownLatch.await();

    }

    class Mythread implements Runnable{
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"执行。。。");
            countDownLatch.countDown();
        }
    }


}

package com.Thread;


import org.junit.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 功能描述:
 * Author: zgdz.xf
 * Date: 2022/04/22/下午 5:16
 **/
public class ReetranLockTest implements Runnable{
    private  static Integer num=1000;
    ReentrantLock lock=new ReentrantLock();
    Condition condition=lock.newCondition();

    Thread [] threads=new Thread[5];

//    @Override
//    public void run() {
//        try {
//            while (num>0) {
//                lock.lock();
//                num--;
//                System.out.println(Thread.currentThread().getName() + "-----" + num);
//            }
//        }finally {
//            lock.unlock();
//        }
//    }

    @Override
    public void run() {
        synchronized (this){
            while (num>0) {
                num--;
                System.out.println(Thread.currentThread().getName() + "-----" + num);
            }
        }

    }

    @Test
    public  void test() throws InterruptedException {
        long start = System.currentTimeMillis();
        for(int i =0;i<5;i++){
            threads[i]=new Thread(new ReetranLockTest());
            threads[i].start();
        }

        threads[4].join();

        long end = System.currentTimeMillis();
        System.out.println(end-start);

        Thread.yield();




//        new Thread(()->{
//            try {
//                lock.lock();
//                while (num>0){
//                    num--;
//                    System.out.println(Thread.currentThread().getName()+"-----"+num);
//                }
//            }finally {
//                lock.unlock();
//            }
//
//        },"thread2").start();
//        if(lock.tryLock(1,TimeUnit.SECONDS)){
//            lock.lock();
//            thread2.start();
//        }


    }

}

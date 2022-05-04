package com.Thread;

import java.util.concurrent.TimeUnit;

/*
 * 功能描述:
 * Author: zgdz.xf
 * Date: 2022/04/25/下午 3:28
 **/
public class VolatitleTest {
    static class MyTest{
        private  Integer num=0;
        public synchronized void incre(){
            num++;
        }
    }

    public static void main(String[] args) {
        MyTest myTest=new MyTest();
        for (int i = 0; i < 3; i++) {
            new Thread(()->{
                for (int j = 0; j < 1000; j++) {
                    myTest.incre();
                }

            },"Thread---"+i).start();
        }

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(myTest.num);

    }

}

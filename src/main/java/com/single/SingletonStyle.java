package com.single;

/*
 * 功能描述:
 * Author: zgdz.xf
 * Date: 2022/04/11/下午 1:48
 **/
public class SingletonStyle {
    private SingletonStyle(){}

    //饿汉模式1
//    private static SingletonStyle singletonStyle=new SingletonStyle();
//
//    public static SingletonStyle getInstant(){
//        return singletonStyle;
//    }

    //饿汉模式2
//    private static SingletonStyle singletonStyle;
//
//    static {
//        singletonStyle=new SingletonStyle();
//    }
//    public static SingletonStyle getInstant(){
//        return singletonStyle;
//    }

    //懒汉模式1(不安全)

//    private static SingletonStyle singletonStyle;
//
//    public static SingletonStyle getIntsant(){
//        if(singletonStyle==null){
//            singletonStyle=new SingletonStyle();
//        }
//        return singletonStyle;
//    }

    //懒汉模式2(同步方法)
//
//    private static SingletonStyle singletonStyle;
//
//    public static synchronized SingletonStyle getIntsant(){
//        if(singletonStyle==null){
//            singletonStyle=new SingletonStyle();
//        }
//        return singletonStyle;
//    }

    //懒汉模式3(同步代码块)

//    private static SingletonStyle singletonStyle;
//
//    public static  SingletonStyle getIntsant(){
//
//        if(singletonStyle==null){
//            synchronized (SingletonStyle.class) {
//                singletonStyle = new SingletonStyle();
//            }
//        }
//        return singletonStyle;
//    }

    //懒汉模式4(双重检查，推荐使用)
//
//    private static volatile SingletonStyle singletonStyle;
//
//    public static  synchronized SingletonStyle getIntsant(){
//
//        if(singletonStyle==null){
//            synchronized (SingletonStyle.class) {
//                if(singletonStyle==null){
//                    singletonStyle = new SingletonStyle();
//                }
//            }
//        }
//        return singletonStyle;
//    }


//静态内部类（推荐使用）
//    private static class SingleInstance{
//        //使用finnal静态变量
//       private static final SingletonStyle singletonStyle=new SingletonStyle();
//    }
//
//    public static  synchronized SingletonStyle getIntsant(){
//        return SingleInstance.singletonStyle;
//    }

    enum  SingleInstant{
        INSTANT;//单例对象作为属性

    }



}

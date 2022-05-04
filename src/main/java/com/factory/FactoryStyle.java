package com.factory;

import java.util.Random;

/*
 * 功能描述:工厂模式
 * Author: zgdz.xf
 * Date: 2022/04/11/下午 2:03
 **/
public abstract class FactoryStyle {
    public  abstract Car creatCar(String carType);

    public FactoryStyle(){
       String carType=getCatType();
        Car car=null;
        car=creatCar(carType);
    }

    public  String getCatType(){
        String []cartyoe=new String[]{"byd","baoma","benchi"};
        int len=cartyoe.length;
        Random random=new Random();
        int index=random.nextInt(len);
       return cartyoe[index];
    }


}

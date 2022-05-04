package com.builder;

/*
 * 功能描述:
 * Author: zgdz.xf
 * Date: 2022/04/13/下午 7:44
 **/
public class Client {
    public static void main(String[] args) {
        CommonBuilder commonBuilder=new CommonBuilder();
        HouseDirector houseDirector=new HouseDirector(commonBuilder);
        houseDirector.buildHouse();

        HightBuilder hightBuilder=new HightBuilder();
        houseDirector.setHouseBuilder(hightBuilder);
        houseDirector.buildHouse();

    }


}

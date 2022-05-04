package com.builder;

/*
 * 功能描述:
 * Author: zgdz.xf
 * Date: 2022/04/13/下午 7:59
 **/
public class HouseDirector {
    HouseBuilder houseBuilder=null;
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder=houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse(){
        houseBuilder.buildDiji();
        houseBuilder.buildWall();
        houseBuilder.buildMohui();
        houseBuilder.buildFengDing();
    }

}

package com.builder;

/*
 * 功能描述:
 * Author: zgdz.xf
 * Date: 2022/04/13/下午 7:45
 **/
public abstract class HouseBuilder {
    House house=new House();

    public abstract void buildDiji();
    public abstract void buildWall();
    public abstract void buildMohui();
    public abstract void buildFengDing();

    public House buildHouse(){
        return house;
    }
}

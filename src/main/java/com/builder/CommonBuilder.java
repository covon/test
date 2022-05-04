package com.builder;

/*
 * 功能描述:
 * Author: zgdz.xf
 * Date: 2022/04/13/下午 7:45
 **/
public class CommonBuilder extends HouseBuilder{
    @Override
    public void buildDiji() {
        System.out.println("打矮地基。。。。");
    }

    @Override
    public void buildWall() {
        System.out.println("建墙5M。。。。");
    }

    @Override
    public void buildMohui() {
        System.out.println("抹灰。。。。");
    }

    @Override
    public void buildFengDing() {
        System.out.println("封顶。。。");
    }

}

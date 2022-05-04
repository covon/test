package com;

/*
 * 功能描述:
 * Author: zgdz.xf
 * Date: 2022/04/15/下午 8:45
 **/
public enum  EnumTest2 {
    LOW(1,"低等"),
    MEDIU(2,"中等"),
    HIGHT(3,"高等");

    int lelvel;
    String lelvelDesc;

    EnumTest2(int level,String lelvelDesc) {
        this.lelvel=level;
        this.lelvelDesc=lelvelDesc;
    }

    public int getLelvel() {
        return lelvel;
    }

    public void setLelvel(int lelvel) {
        this.lelvel = lelvel;
    }

    public String getLelvelDesc() {
        return lelvelDesc;
    }

    public void setLelvelDesc(String lelvelDesc) {
        this.lelvelDesc = lelvelDesc;
    }
}

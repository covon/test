package com;

/*
 * 功能描述:
 * Author: zgdz.xf
 * Date: 2022/04/15/下午 8:24
 **/
public enum  EnumTest implements Level {
    LOW(){
        public String getLelvel() {
            return "low";
        }
    },
    MEDIU(){
        public String getLelvel() {
            return "medium";
        }
    },
    HIGHT(){
        public String getLelvel() {
            return "hight";
        }
    };


}


interface Level{
    public String getLelvel();
}

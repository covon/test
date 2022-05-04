package com.factory;

/*
 * 功能描述:
 * Author: zgdz.xf
 * Date: 2022/04/11/下午 9:42
 **/
public class Car {
    private String carType;
    private String carColor;
    private Double carPrice;

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public Double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarCore(){
        return carColor+carType+carPrice;
    }
}

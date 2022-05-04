package com.lambda;

/*
 *功能描述:
 *作者 zgdz
 *时间: 2022/04/18/下午 2:55
 **/
public interface LambdaTest {
    public default String getString(String str) {
        return str;
    }

    public String getString2(String str);
}

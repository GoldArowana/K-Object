package com.king.objects.pojo;

import java.io.Serializable;

/**
 * Created By Arowana-King on 2018/3/20 at 上午12:28
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class Son extends Father implements Serializable {
    private int a;
    private int b;

    public Son() {
        System.out.println("construct");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

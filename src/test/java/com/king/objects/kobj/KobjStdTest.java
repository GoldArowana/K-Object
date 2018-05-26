package com.king.objects.kobj;

import com.king.objects.pojo.Son;

/**
 * Created By Arowana-King on 2018/3/31 at 下午2:13
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class KobjStdTest {
    public static void main(String[] args) {
        Kobj kobj1 = new KobjStd();
        Son son = kobj1.newInstance(Son.class);
        son.setA(10);
        System.out.println(son.getA());
    }
}

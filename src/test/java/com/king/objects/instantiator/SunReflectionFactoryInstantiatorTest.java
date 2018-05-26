package com.king.objects.instantiator;

import com.king.objects.pojo.Father;
import com.king.objects.pojo.Son;
import org.junit.Test;

/**
 * Created By Arowana-King on 2018/3/27 at 下午4:11
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class SunReflectionFactoryInstantiatorTest {
    @Test
    public void test1() {
        ObjectInstantiator<Father> instantiator = new SunReflectionFactoryInstantiator<Father>(Father.class);
        Father father = instantiator.newInstance();
        father.toString();
    }

    @Test
    public void test2() {
        ObjectInstantiator<Son> instantiator = new SunReflectionFactoryInstantiator<Son>(Son.class);
        Son son = instantiator.newInstance();
        son.setA(102);
        System.out.println(son.getA());
    }
}

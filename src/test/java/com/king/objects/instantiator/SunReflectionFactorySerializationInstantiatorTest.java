package com.king.objects.instantiator;

import com.king.objects.pojo.Father;
import com.king.objects.pojo.Son;
import org.junit.Test;

/**
 * Created By Arowana-King on 2018/3/27 at 下午4:36
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class SunReflectionFactorySerializationInstantiatorTest {
    @Test
    public void test() {
        SunReflectionFactorySerializationInstantiator<Son> instantiator = new SunReflectionFactorySerializationInstantiator<Son>(Son.class);
        Son son = instantiator.newInstance();
        son.setA(1021);
        System.out.println(son.getA());
    }

    @Test
    public void test2() {
        SunReflectionFactorySerializationInstantiator<Father> instantiator = new SunReflectionFactorySerializationInstantiator<Father>(Father.class);
        Father father = instantiator.newInstance();
        System.out.println(father.toString());
    }
}

package com.king.objects.instantiator;

import com.king.objects.pojo.Father;
import com.king.objects.pojo.Son;
import org.junit.Test;

/**
 * Created By Arowana-King on 2018/3/27 at 下午4:43
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class UnsafeFactoryInstantiatorTest {
    @Test
    public void test() {
        UnsafeFactoryInstantiator<Father> instantiator = new UnsafeFactoryInstantiator<Father>(Father.class);
        Father father = instantiator.newInstance();
        System.out.println(father.toString());
    }

    @Test
    public void test2() {
        UnsafeFactoryInstantiator<Son> instantiator = new UnsafeFactoryInstantiator<>(Son.class);
        Son son = instantiator.newInstance();
    }
}

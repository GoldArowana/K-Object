package com.king.objects.kobj;

import com.king.objects.instantiator.ObjectInstantiator;

/**
 * Created By Arowana-King on 2018/3/31 at 下午2:02
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public interface Kobj {
    <T> T newInstance(Class<T> clazz);

    <T> ObjectInstantiator<T> getInstantiatorOf(Class<T> clazz);
}

package com.king.objects.instantiator;

import com.king.objects.exception.KObjException;
import com.king.objects.tools.SunReflectionFactoryHelper;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created By Arowana-King on 2018/3/27 at 下午3:25
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class SunReflectionFactoryInstantiator<T> implements ObjectInstantiator<T> {

    private final Constructor<T> mungedConstructor;

    public SunReflectionFactoryInstantiator(Class<T> type) {
        try {
            mungedConstructor = SunReflectionFactoryHelper.newConstructorForSerialization(type, Object.class.getConstructor((Class[]) null));
        } catch (NoSuchMethodException e) {
            throw new KObjException(e);
        }
        mungedConstructor.setAccessible(true);
    }

    @Override
    public T newInstance() {
        try {
            return mungedConstructor.newInstance((Object[]) null);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new KObjException(e);
        }
    }
}

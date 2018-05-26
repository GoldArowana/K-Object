package com.king.objects.instantiator;

import com.king.objects.exception.KObjException;
import com.king.objects.tools.SerializationInstantiatorHelper;
import com.king.objects.tools.SunReflectionFactoryHelper;

import java.lang.reflect.Constructor;

/**
 * Created By Arowana-King on 2018/3/27 at 下午3:41
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class SunReflectionFactorySerializationInstantiator<T> implements ObjectInstantiator<T> {
    private final Constructor<T> mungedConstructor;

    public SunReflectionFactorySerializationInstantiator(Class<T> type) {
        Class<? super T> nonSerializableAncestor = SerializationInstantiatorHelper.getNonSerializationSuperClass(type);
        Constructor<? super T> nonSerializableAncestorConstructor;
        try {
            nonSerializableAncestorConstructor = nonSerializableAncestor.getDeclaredConstructor((Class[]) null);
        } catch (NoSuchMethodException e) {
            throw new KObjException(e);
        }
        mungedConstructor = SunReflectionFactoryHelper.newConstructorForSerialization(type, nonSerializableAncestorConstructor);
        mungedConstructor.setAccessible(true);
    }

    @Override
    public T newInstance() {
        try {
            return mungedConstructor.newInstance((Object[]) null);
        } catch (Exception e) {
            throw new KObjException(e);
        }
    }
}

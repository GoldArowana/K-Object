package com.king.objects.strategy;

import com.king.objects.exception.KObjException;
import com.king.objects.instantiator.ObjectInstantiator;
import com.king.objects.instantiator.SunReflectionFactorySerializationInstantiator;

import java.io.NotSerializableException;
import java.io.Serializable;

/**
 * Created By Arowana-King on 2018/3/27 at 下午7:54
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class SerializingInstantiatorStrategy implements InstantiatorStrategy {

    @Override
    public <T> ObjectInstantiator<T> newInstantiatorOf(Class<T> type) {
        if (!Serializable.class.isAssignableFrom(type)) {
            throw new KObjException(new NotSerializableException(type + " not serializable"));
        }
        return new SunReflectionFactorySerializationInstantiator<>(type);
    }
}

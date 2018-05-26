package com.king.objects.tools;

import com.king.objects.exception.KObjException;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created By Arowana-King on 2018/3/26 at 下午3:22
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class SunReflectionFactoryHelper {
    @SuppressWarnings("unchecked")
    public static <T> Constructor<T> newConstructorForSerialization(Class<T> type, Constructor<?> constructor) {
        try {
            Class<?> reflectionFactoryClass = Class.forName("sun.reflect.ReflectionFactory");
            Object reflectionFactory = reflectionFactoryClass.getDeclaredMethod("getReflectionFactory").invoke(null);
            Method newConstructorForSerializationMethod = reflectionFactoryClass.getDeclaredMethod("newConstructorForSerialization", Class.class, Constructor.class);
            return (Constructor<T>) newConstructorForSerializationMethod.invoke(reflectionFactory, type, constructor);
        } catch (Exception e) {
            throw new KObjException(e);
        }
    }
}
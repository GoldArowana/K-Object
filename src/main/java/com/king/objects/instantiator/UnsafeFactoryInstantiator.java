package com.king.objects.instantiator;


import com.king.objects.exception.KObjException;
import com.king.objects.tools.UnsafeHelper;

/**
 * Created By Arowana-King on 2018/3/27 at 下午4:16
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class UnsafeFactoryInstantiator<T> implements ObjectInstantiator<T> {
    private final Class<T> type;

    public UnsafeFactoryInstantiator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T newInstance() {
        try {
            return type.cast(UnsafeHelper.getUnsafe().allocateInstance(type));
        } catch (InstantiationException e) {
            throw new KObjException(e);
        }
    }
}

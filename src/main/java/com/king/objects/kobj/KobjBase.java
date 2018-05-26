package com.king.objects.kobj;

import com.king.objects.instantiator.ObjectInstantiator;
import com.king.objects.strategy.InstantiatorStrategy;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created By Arowana-King on 2018/3/21 at 下午12:25
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class KobjBase implements Kobj {

    protected final InstantiatorStrategy strategy;

    protected ConcurrentHashMap<String, ObjectInstantiator<?>> cache;

    public KobjBase(InstantiatorStrategy strategy) {
        this(strategy, false);
    }

    public KobjBase(InstantiatorStrategy strategy, boolean useCache) {
        if ((this.strategy = strategy) == null) {
            throw new IllegalArgumentException("strategy can be null");
        }
        cache = useCache ? new ConcurrentHashMap<String, ObjectInstantiator<?>>() : null;
    }

    @Override
    public String toString() {
        return getClass().getName() + " using " + strategy.getClass().getName() + (cache == null ? " without" : " with") + " caching";
    }

    @Override
    public <T> T newInstance(Class<T> clazz) {
        return getInstantiatorOf(clazz).newInstance();
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> ObjectInstantiator<T> getInstantiatorOf(Class<T> clazz) {
        //此方法主要用来判断Class是否为原始类型（boolean、char、byte、short、int、long、float、double）
        if (clazz.isPrimitive()) {
            throw new IllegalArgumentException("class can not be primitive");
        }
        if (cache == null) {
            return strategy.newInstantiatorOf(clazz);
        }
        ObjectInstantiator<?> instantiator = cache.get(clazz.getName());
        if (instantiator == null) {
            ObjectInstantiator newInstantiator = strategy.newInstantiatorOf(clazz);
            if ((instantiator = cache.putIfAbsent(clazz.getName(), newInstantiator)) == null) {
                instantiator = newInstantiator;
            }
        }
        return (ObjectInstantiator<T>) instantiator;
    }
}

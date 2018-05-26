package com.king.objects.strategy;

import com.king.objects.instantiator.ObjectInstantiator;
import com.king.objects.instantiator.SunReflectionFactoryInstantiator;
import com.king.objects.instantiator.UnsafeFactoryInstantiator;

import static com.king.objects.tools.PlatformDescriptionHelper.*;

/**
 * Created By Arowana-King on 2018/3/27 at 下午7:57
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class StdInstantiatorStrategy implements InstantiatorStrategy {
    @Override
    public <T> ObjectInstantiator<T> newInstantiatorOf(Class<T> type) {
        if (isThisJVM(HOTSPOT)) {
            return new SunReflectionFactoryInstantiator<>(type);
        }
        return new UnsafeFactoryInstantiator<>(type);
    }
}

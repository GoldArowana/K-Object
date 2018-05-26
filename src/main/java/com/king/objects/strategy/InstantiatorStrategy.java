package com.king.objects.strategy;

import com.king.objects.instantiator.ObjectInstantiator;

/**
 * Created By Arowana-King on 2018/3/27 at 下午6:21
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public interface InstantiatorStrategy {
    <T> ObjectInstantiator<T> newInstantiatorOf(Class<T> type);
}

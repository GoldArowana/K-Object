package com.king.objects.kobj;

/**
 * Created By Arowana-King on 2018/3/21 at 下午12:25
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */

import com.king.objects.strategy.SerializingInstantiatorStrategy;

public class KobjSerializer extends KobjBase {

    public KobjSerializer() {
        super(new SerializingInstantiatorStrategy());
    }

    public KobjSerializer(boolean useCache) {
        super(new SerializingInstantiatorStrategy(), useCache);
    }
}

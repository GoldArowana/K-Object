package com.king.objects.kobj;


import com.king.objects.strategy.StdInstantiatorStrategy;

/**
 * Created By Arowana-King on 2018/3/21 at 下午7:39
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class KobjStd extends KobjBase {
    public KobjStd() {
        super(new StdInstantiatorStrategy());
    }

    public KobjStd(boolean useCache) {
        super(new StdInstantiatorStrategy(), useCache);
    }
}

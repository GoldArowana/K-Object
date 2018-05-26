package com.king.objects.tools;

import java.io.Serializable;

/**
 * Created By Arowana-King on 2018/3/26 at 下午2:38
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class SerializationInstantiatorHelper {
    /**
     * @param type
     * @param <T>
     * @return 从type类开始逐层遍历其父类, 找到第一个非实现Serializable接口的类
     */
    public static <T> Class<? super T> getNonSerializationSuperClass(Class<T> type) {
        Class<? super T> result = type;
        while (Serializable.class.isAssignableFrom(result)) {
            result = result.getSuperclass();
            if (result == null) {
                throw new Error("该类的所有父类都继承自Serializable接口");
            }
        }
        return result;
    }
}

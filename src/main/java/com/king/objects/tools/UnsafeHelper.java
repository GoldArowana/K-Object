package com.king.objects.tools;

import com.king.objects.exception.KObjException;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created By Arowana-King on 2018/3/27 at 下午2:50
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class UnsafeHelper {
    private static final Unsafe unsafe;

    static {
        Field f;
        try {
            f = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            throw new KObjException(e);
        }
        f.setAccessible(true);
        try {
            unsafe = (Unsafe) f.get(null);
        } catch (IllegalAccessException e) {
            throw new KObjException(e);
        }
    }

    private UnsafeHelper() {
    }

    public static Unsafe getUnsafe() {
        return unsafe;
    }
}

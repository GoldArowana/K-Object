package com.king.objects.exception;

import org.junit.Test;

/**
 * Created By Arowana-King on 2018/3/26 at 下午2:14
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class KObjectExceptionTest {
    @Test
    public void test1() {
        try {
            throw new KObjException("异常123");
        } catch (RuntimeException ignored) {
            System.out.println("忽略运行时异常");
            System.out.println("输出:" + ignored.getMessage());
        }
    }
}

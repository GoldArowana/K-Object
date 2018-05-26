package com.king.objects.tools;

import org.junit.Test;

/**
 * Created By Arowana-King on 2018/3/26 at 下午2:27
 * author 金龙
 * depart 计算机15-8
 * school 哈尔滨理工大学
 * version 1.0
 * describe
 */
public class PlatformDescriptionHelperTest {
    @Test
    public void test() {
        System.out.println("判断当前机器运行的jvm是否是hotspot: " + PlatformDescriptionHelper.isThisJVM("Java HotSpot"));
        System.out.println("当前机器运行的jvm是: " + PlatformDescriptionHelper.getThisJVM());
    }
}
